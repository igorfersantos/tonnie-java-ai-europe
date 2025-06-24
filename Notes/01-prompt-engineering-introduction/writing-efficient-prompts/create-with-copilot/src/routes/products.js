// routes/products.js
const express = require('express');
const router = express.Router();
const productsController = require('../controllers/productsController');
const validateProduct = require('../middlewares/validateProduct');

// Lista todos os produtos
router.get('/', productsController.getAll);
// Busca produto por ID
router.get('/:id', productsController.getById);
// Cria novo produto (com validação)
router.post('/', validateProduct, productsController.create);
// Atualiza produto (com validação)
router.put('/:id', validateProduct, productsController.update);
// Deleta produto
router.delete('/:id', productsController.remove);

module.exports = router;