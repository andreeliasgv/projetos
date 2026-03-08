```markdown
# 🐾 PETSHOP — Banco de Dados PostgreSQL

Este projeto apresenta a modelagem e implementação de um banco de dados relacional para gerenciamento de um **Pet Shop**, utilizando **PostgreSQL**.

O sistema permite gerenciar:

- Funcionários
- Clientes
- Animais
- Serviços realizados
- Fornecedores
- Produtos
- Vendas

O objetivo do projeto é demonstrar conceitos de **modelagem de banco de dados relacional**, **chaves primárias**, **chaves estrangeiras** e **relacionamentos entre entidades**.

---

# 🗂 Estrutura do Banco de Dados

O banco de dados é composto pelas seguintes tabelas:

| Tabela | Descrição |
|------|------|
| CARGOS | Cargos dos funcionários |
| FUNCIONARIOS | Funcionários do pet shop |
| CLIENTES | Clientes que utilizam os serviços |
| ANIMAL | Animais atendidos |
| SERVICOS | Serviços realizados no pet shop |
| FORNECEDORES | Fornecedores de produtos |
| PRODUTOS | Produtos vendidos |
| VENDA | Registro das vendas realizadas |

---

# 🔗 Relacionamentos

### CARGOS → FUNCIONARIOS
Um cargo pode estar associado a vários funcionários.

```

CARGOS (1) ---- (N) FUNCIONARIOS

```

### FUNCIONARIOS → SERVICOS
Um funcionário pode realizar vários serviços.

```

FUNCIONARIOS (1) ---- (N) SERVICOS

```

### CLIENTES → SERVICOS
Um cliente pode solicitar vários serviços para seus animais.

```

CLIENTES (1) ---- (N) SERVICOS

```

### ANIMAL → SERVICOS
Um animal pode receber vários serviços.

```

ANIMAL (1) ---- (N) SERVICOS

```

### FORNECEDORES → PRODUTOS
Um fornecedor pode fornecer vários produtos.

```

FORNECEDORES (1) ---- (N) PRODUTOS

```

### FUNCIONARIOS → VENDA
Um funcionário pode realizar várias vendas.

```

FUNCIONARIOS (1) ---- (N) VENDA

```

### CLIENTES → VENDA
Um cliente pode realizar várias compras.

```

CLIENTES (1) ---- (N) VENDA

```

### PRODUTOS → VENDA
Um produto pode aparecer em várias vendas.

```

PRODUTOS (1) ---- (N) VENDA

````

---

# 🧱 Modelo de Dados

O banco utiliza os seguintes conceitos:

- **Primary Key (PK)** para identificar registros únicos
- **Foreign Key (FK)** para garantir integridade referencial
- Tipos de dados SQL como:
  - `VARCHAR`
  - `INT`
  - `NUMERIC`
  - `DATE`
  - `CHAR`

---

# ⚙️ Como Executar o Projeto

1. Instale o **PostgreSQL**
2. Crie um banco de dados:

```sql
CREATE DATABASE petshop;
````

3. Conecte ao banco:

```sql
\c petshop
```

4. Execute o script SQL do projeto:

```sql
\i PETSHOP.sql
```

---

# 📊 Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas:

* Relacionar **ANIMAL com CLIENTE (dono do animal)**
* Criar tabelas de **itens de venda**
* Utilizar **IDs automáticos (SERIAL ou IDENTITY)**
* Criar **views para relatórios**
* Criar **procedures ou triggers**

---

# 📚 Tecnologias Utilizadas

* PostgreSQL
* SQL (ANSI)

---

# 👨‍💻 Autor

Projeto acadêmico para estudo de **modelagem e implementação de banco de dados relacionais** utilizando PostgreSQL.

```
```
