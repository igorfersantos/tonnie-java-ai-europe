const express = require('express');
const router = express.Router();
const Joi = require('joi'); // Biblioteca para validação de dados

// Banco de dados fake em memória
let products = [];
let nextId = 1;

// Esquema de validação para criação de produto
const productSchema = Joi.object({
    name: Joi.string().min(3).required().messages({
        'string.base': `"name" deve ser uma string`,
        'string.empty': `"name" não pode ser vazio`,
        'string.min': `"name" deve ter no mínimo 3 caracteres`,
        'any.required': `"name" é obrigatório`
    }),
    price: Joi.number().positive().required().messages({
        'number.base': `"price" deve ser um número`,
        'number.positive': `"price" deve ser positivo`,
        'any.required': `"price" é obrigatório`
    })
});

// GET /api/products → Listar todos os produtos
router.get('/', (req, res) => {
    res.json(products);
});

// POST /api/products → Criar um novo produto
router.post('/', (req, res) => {
    // Valida o corpo da requisição
    const { error, value } = productSchema.validate(req.body, { abortEarly: false });

    if (error) {
        // Se houver erro, retorna os detalhes da validação
        return res.status(400).json({
            errors: error.details.map(detail => detail.message)
        });
    }

    const newProduct = {
        id: nextId++,
        name: value.name,
        price: value.price
    };

    products.push(newProduct);
    res.status(201).json(newProduct);
});

// PUT /api/products/:id → Editar um produto existente
router.put('/:id', (req, res) => {
    const productId = parseInt(req.params.id);

    // Verifica se o produto existe
    const product = products.find(p => p.id === productId);
    if (!product) {
        return res.status(404).json({ error: 'Produto não encontrado.' });
    }

    // Valida os dados recebidos
    const { error, value } = productSchema.validate(req.body, { abortEarly: false });
    if (error) {
        return res.status(400).json({
            errors: error.details.map(detail => detail.message)
        });
    }

    // Atualiza os campos do produto
    product.name = value.name;
    product.price = value.price;

    res.json(product);
});

// DELETE /api/products/:id → Excluir um produto
router.delete('/:id', (req, res) => {
    const productId = parseInt(req.params.id);
    const index = products.findIndex(p => p.id === productId);

    if (index === -1) {
        return res.status(404).json({ error: 'Produto não encontrado.' });
    }

    products.splice(index, 1);
    res.json({ message: 'Produto excluído com sucesso.' });
});

module.exports = router;

