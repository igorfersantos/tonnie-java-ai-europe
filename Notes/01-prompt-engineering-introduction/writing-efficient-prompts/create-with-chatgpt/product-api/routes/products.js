const express = require('express');
const router = express.Router();

// Banco de dados em memória (Array simples)
let products = [];
let nextId = 1;

// Listar todos os produtos
router.get('/', (req, res) => {
    res.json(products);
});

// Criar um novo produto
router.post('/', (req, res) => {
    const { name, price } = req.body;

    if (!name || !price) {
        return res.status(400).json({ error: 'Nome e preço são obrigatórios.' });
    }

    const newProduct = {
        id: nextId++,
        name,
        price
    };

    products.push(newProduct);
    res.status(201).json(newProduct);
});

// Editar um produto existente
router.put('/:id', (req, res) => {
    const productId = parseInt(req.params.id);
    const { name, price } = req.body;

    const product = products.find(p => p.id === productId);
    if (!product) {
        return res.status(404).json({ error: 'Produto não encontrado.' });
    }

    if (name) product.name = name;
    if (price) product.price = price;

    res.json(product);
});

// Excluir um produto
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

