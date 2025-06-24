// middlewares/validateProduct.js
// Middleware para validar os dados do produto
module.exports = (req, res, next) => {
  const { name, price } = req.body;
  if (typeof name !== 'string' || name.trim() === '') {
    return res.status(400).json({ error: 'Nome é obrigatório e deve ser uma string' });
  }
  if (typeof price !== 'number' || price <= 0) {
    return res.status(400).json({ error: 'Preço deve ser um número positivo' });
  }
  next();
};