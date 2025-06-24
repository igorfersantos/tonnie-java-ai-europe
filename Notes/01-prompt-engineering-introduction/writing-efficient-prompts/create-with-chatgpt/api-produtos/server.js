// Importa o Express
const express = require('express');
const app = express();

// Importa as rotas de produtos
const productsRoutes = require('./routes/products');

// Middleware para parsear JSON no body das requisições
app.use(express.json());

// Registra as rotas de produtos com o prefixo /api/products
app.use('/api/products', productsRoutes);

// Inicia o servidor na porta 3000
const PORT = 3001;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});

