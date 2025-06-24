// models/product.js
// Simula um banco de dados em memória
let products = [];
let nextId = 1;

module.exports = {
  getAll: () => products,
  getById: (id) => products.find(p => p.id === id),
  create: (data) => {
    const product = { id: nextId++, ...data };
    products.push(product);
    return product;
  },
  update: (id, data) => {
    const index = products.findIndex(p => p.id === id);
    if (index === -1) return null;
    products[index] = { ...products[index], ...data };
    return products[index];
  },
  remove: (id) => {
    const index = products.findIndex(p => p.id === id);
    if (index === -1) return null;
    return products.splice(index, 1)[0];
  }
};