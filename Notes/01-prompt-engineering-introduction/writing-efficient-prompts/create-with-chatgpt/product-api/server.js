const express = require('express');
const app = express();
const productsRoutes = require('./routes/products');

app.use(express.json());

// Rotas de produtos
app.use('/api/products', productsRoutes);

// Iniciar servidor
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});

