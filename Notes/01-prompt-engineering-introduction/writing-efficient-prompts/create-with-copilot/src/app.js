// app.js
// Importa módulos necessários
const express = require('express');
const productsRoutes = require('./routes/products');

const app = express();
app.use(express.json()); // Permite receber JSON

// Rotas de produtos
app.use('/api/products', productsRoutes);

// Inicia o servidor
const PORT = 3002;
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});