// controllers/productsController.js
const Product = require('../models/product');

// Lista todos os produtos
exports.getAll = (req, res) => {
  res.json(Product.getAll());
};

// Busca produto por ID
exports.getById = (req, res) => {
  const product = Product.getById(parseInt(req.params.id));
  if (!product) return res.status(404).json({ error: 'Produto não encontrado' });
  res.json(product);
};

// Cria novo produto
exports.create = (req, res) => {
  const product = Product.create(req.body);
  res.status(201).json(product);
};

// Atualiza produto existente
exports.update = (req, res) => {
  const updated = Product.update(parseInt(req.params.id), req.body);
  if (!updated) return res.status(404).json({ error: 'Produto não encontrado' });
  res.json(updated);
};

// Remove produto
exports.remove = (req, res) => {
  const removed = Product.remove(parseInt(req.params.id));
  if (!removed) return res.status(404).json({ error: 'Produto não encontrado' });
  res.json({ message: 'Produto removido com sucesso' });
};