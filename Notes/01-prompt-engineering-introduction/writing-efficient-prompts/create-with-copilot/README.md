# API de Produtos

Esta API foi desenvolvida para gerenciar um catálogo de produtos, permitindo operações de cadastro, consulta, atualização e remoção. O objetivo é fornecer uma base para sistemas de e-commerce, inventário ou qualquer aplicação que precise manipular produtos de forma simples e eficiente.

## Objetivo
- Centralizar o gerenciamento de produtos.
- Permitir fácil integração com frontends ou outros sistemas.
- Garantir validação de dados para integridade das informações.

## Rotas

### 1. Listar Produtos
- **GET** `/api/products`
- **Descrição:** Retorna todos os produtos cadastrados.
- **Exemplo de uso:**
  ```bash
  curl http://localhost:3002/api/products
  ```

### 2. Buscar Produto por ID
- **GET** `/api/products/:id`
- **Descrição:** Retorna um produto específico pelo ID.
- **Validação:**
  - O parâmetro `id` deve ser um número inteiro existente.
- **Exemplo de uso:**
  ```bash
  curl http://localhost:3002/api/products/1
  ```

### 3. Criar Produto
- **POST** `/api/products`
- **Descrição:** Cria um novo produto.
- **Body:**
  ```json
  {
    "name": "Camiseta",
    "price": 49.9
  }
  ```
- **Validações:**
  - `name` (string): obrigatório, não pode ser vazio.
  - `price` (number): obrigatório, maior que zero.
  - Validações feitas pelo middleware `validateProduct`.
- **Exemplo de uso:**
  ```bash
  curl -X POST http://localhost:3002/api/products \
    -H "Content-Type: application/json" \
    -d '{"name": "Camiseta", "price": 49.9}'
  ```

### 4. Atualizar Produto
- **PUT** `/api/products/:id`
- **Descrição:** Atualiza um produto existente.
- **Body:**
  ```json
  {
    "name": "Camiseta Premium",
    "price": 59.9
  }
  ```
- **Validações:**
  - Mesmo esquema do POST.
  - O parâmetro `id` deve ser um número inteiro existente.
- **Exemplo de uso:**
  ```bash
  curl -X PUT http://localhost:3002/api/products/1 \
    -H "Content-Type: application/json" \
    -d '{"name": "Camiseta Premium", "price": 59.9}'
  ```

### 5. Deletar Produto
- **DELETE** `/api/products/:id`
- **Descrição:** Remove um produto pelo ID.
- **Validação:**
  - O parâmetro `id` deve ser um número inteiro existente.
- **Exemplo de uso:**
  ```bash
  curl -X DELETE http://localhost:3002/api/products/1
  ```

## Middlewares e Validações
- O middleware `validateProduct` garante que os campos obrigatórios estejam presentes e corretos ao criar ou atualizar produtos.
- Retorna erro 400 para dados inválidos.

## Como rodar
1. Instale as dependências:
   ```bash
   npm install
   ```
2. Inicie o servidor:
   ```bash
   node src/app.js
   ```
3. Acesse: [http://localhost:3002/api/products](http://localhost:3002/api/products)

---

Dúvidas? Abra uma issue ou entre em contato.
