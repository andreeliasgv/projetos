```markdown
# 💰 FOLHA-PAGAMENTO — Banco de Dados PostgreSQL

Este projeto apresenta a modelagem e implementação de um banco de dados relacional para um sistema simples de **Folha de Pagamento**, utilizando **PostgreSQL**.

O banco de dados permite gerenciar:

- Bancos utilizados para pagamento
- Departamentos da empresa
- Funcionários e seus salários

O objetivo do projeto é demonstrar conceitos de **modelagem relacional**, **chaves primárias**, **chaves estrangeiras** e **manipulação de dados em SQL**.

---

# 🗂 Estrutura do Banco de Dados

O banco de dados é composto pelas seguintes tabelas:

| Tabela | Descrição |
|------|------|
| BANCOS | Armazena os bancos utilizados para pagamento |
| DEPTOS | Departamentos da empresa |
| FUNCIONARIOS | Funcionários da empresa |

---

# 🔗 Relacionamentos

### DEPTOS → FUNCIONARIOS

Um departamento pode possuir vários funcionários.

```

DEPTOS (1) ---- (N) FUNCIONARIOS

```

### BANCOS → FUNCIONARIOS

Um banco pode estar associado a vários funcionários.

```

BANCOS (1) ---- (N) FUNCIONARIOS

````

---

# 🧱 Estrutura das Tabelas

### BANCOS

Armazena os bancos utilizados para pagamento de salários.

Campos principais:

- COD_BANCO (PK)
- NOME
- AGENCIA
- NUMERO_BANCO

---

### DEPTOS

Armazena os departamentos da empresa.

Campos principais:

- COD_DEPTO (PK)
- NOME

---

### FUNCIONARIOS

Armazena os dados dos funcionários.

Campos principais:

- COD_FUNC (PK)
- NOME
- COD_DEPTO (FK)
- SALARIO
- DATA DE ADMISSÃO
- DATA DE NASCIMENTO
- BANCO DE PAGAMENTO

---

# 🧪 Exemplos de Operações SQL

### Inserção de registros

```sql
INSERT INTO BANCOS
VALUES
(1, 'Banco do Brasil', '0407-3', '6620-6'),
(2, 'Bradesco', '500-4', '1246-88');
````

### Atualização de dados

```sql
UPDATE BANCOS
SET NOME = 'NUBANK'
WHERE COD_BANCO = 1;
```

### Consulta de dados

```sql
SELECT * FROM BANCOS;
```

---

# ⚙️ Como Executar o Projeto

1️⃣ Instale o **PostgreSQL**

2️⃣ Crie um banco de dados:

```sql
CREATE DATABASE folha_pagamento;
```

3️⃣ Conecte ao banco:

```sql
\c folha_pagamento
```

4️⃣ Execute o script SQL:

```sql
\i FOLHA-PAGAMENTO.sql
```

---

# 📊 Possíveis Melhorias Futuras

Algumas evoluções que podem ser implementadas:

* Tabela de **benefícios**
* Tabela de **descontos**
* Sistema de **holerite mensal**
* **Histórico de salários**
* **Controle de cargos e promoções**
* Relatórios com **views e consultas agregadas**

---

# 📚 Tecnologias Utilizadas

* PostgreSQL
* SQL (ANSI)

---

# 👨‍💻 Autor

Projeto acadêmico desenvolvido para estudo de **modelagem e manipulação de banco de dados relacionais** utilizando PostgreSQL.

```
