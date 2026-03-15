# 🚗 Banco de Dados — Concessionária de Veículos

Este projeto apresenta a **modelagem e implementação de um banco de dados relacional utilizando PostgreSQL** para gerenciamento de **clientes e veículos** em uma concessionária.

O objetivo do projeto é demonstrar conceitos fundamentais de **modelagem de banco de dados**, **chaves primárias e estrangeiras**, **inserção de dados** e **consultas SQL**.

---

# 📁 Estrutura do Projeto

O projeto está organizado em **três arquivos SQL**, cada um responsável por uma etapa do banco de dados.

```
.
├── Estrutura.sql
├── Dados.sql
└── Funcoes.sql
```

| Arquivo           | Descrição                                         |
| ----------------- | ------------------------------------------------- |
| **Estrutura.sql** | Criação das tabelas e definição de chaves         |
| **Dados.sql**     | Inserção de dados nas tabelas                     |
| **Funcoes.sql**   | Consultas SQL para análise e manipulação de dados |

---

# 🗂 Modelagem do Banco de Dados

O banco possui duas tabelas principais:

* **CLIENTES**
* **VEICULOS**

Existe um relacionamento entre elas através do **CPF do cliente**.

---

# 👤 Tabela CLIENTES

Armazena informações sobre os clientes da concessionária.

| Campo    | Tipo        | Descrição                       |
| -------- | ----------- | ------------------------------- |
| cod_cli  | INTEGER     | Código do cliente               |
| cpf      | INTEGER     | CPF do cliente (chave primária) |
| nome     | VARCHAR(50) | Nome do cliente                 |
| endereco | VARCHAR(50) | Endereço                        |
| cidade   | VARCHAR(50) | Cidade                          |
| estado   | VARCHAR(2)  | Estado                          |
| salario  | INTEGER     | Salário do cliente              |
| idade    | INTEGER     | Idade do cliente                |

Exemplo de criação da tabela:

```sql
CREATE TABLE clientes (
cod_cli INTEGER NOT NULL,
cpf INTEGER NOT NULL,
nome VARCHAR(50),
endereco VARCHAR(50),
cidade VARCHAR(50),
estado VARCHAR(2),
salario INTEGER,
idade INTEGER,
CONSTRAINT PK_CPFcliente PRIMARY KEY (cpf)
);
```

---

# 🚙 Tabela VEICULOS

Armazena informações sobre os veículos associados aos clientes.

| Campo          | Tipo        | Descrição                          |
| -------------- | ----------- | ---------------------------------- |
| chassi         | VARCHAR(50) | Número do chassi                   |
| placa          | VARCHAR(10) | Placa do veículo (chave primária)  |
| cor            | VARCHAR(20) | Cor do veículo                     |
| modelo         | VARCHAR(20) | Modelo                             |
| marca          | VARCHAR(20) | Marca                              |
| ano_fabricacao | INTEGER     | Ano de fabricação                  |
| preco_compra   | INTEGER     | Preço de compra                    |
| preco_venda    | INTEGER     | Preço de venda                     |
| motor          | INTEGER     | Motor do veículo                   |
| cpf_cli        | INTEGER     | CPF do cliente (chave estrangeira) |

Relacionamento com a tabela **clientes**:

```sql
ALTER TABLE veiculos
ADD CONSTRAINT fk_cpf_cli
FOREIGN KEY (cpf_cli) REFERENCES clientes (cpf);
```

---

# 🔗 Relacionamento entre Tabelas

O relacionamento do banco é:

```
CLIENTES
   │
   │ (1:N)
   │
VEICULOS
```

Ou seja:

* **Um cliente pode possuir vários veículos**
* **Cada veículo pertence a apenas um cliente**

---

# 📊 Inserção de Dados

O arquivo **Dados.sql** contém registros de exemplo para popular o banco.

Exemplo de inserção de cliente:

```sql
INSERT INTO clientes(cod_cli,cpf,nome,endereco,cidade,estado,salario,idade)
VALUES (01,11,'BEATRIZ','RUA 01','FERNANDOPOLIS','SP',1800,32);
```

Exemplo de inserção de veículo:

```sql
INSERT INTO VEICULOS(CHASSI,PLACA,COR,MODELO,MARCA,ANO_FABRICACAO,PRECO_COMPRA,PRECO_VENDA,MOTOR,cpf_cli)
VALUES ('GM02','ESC2033','BRANCO','HILUX','TOYOTA',2018,160000,175000,1.8,11);
```

---

# 🔎 Consultas SQL

O arquivo **Funcoes.sql** contém diversas consultas para análise de dados.

## Exemplos de consultas com LIKE

Selecionar clientes cujo nome começa com **A**:

```sql
SELECT * FROM CLIENTES WHERE nome LIKE 'A%';
```

Clientes cujo nome contém **i**:

```sql
SELECT * FROM CLIENTES WHERE nome LIKE '%i%';
```

Clientes com exatamente **5 caracteres no nome**:

```sql
SELECT * FROM CLIENTES WHERE nome LIKE '_____';
```

---

# 📈 Consultas com Funções de Agregação

### Média salarial dos clientes

```sql
SELECT AVG(salario)::NUMERIC(10,2) AS media_salarios
FROM CLIENTES;
```

### Maior salário

```sql
SELECT MAX(salario) AS maior_salario
FROM CLIENTES;
```

### Menor salário

```sql
SELECT MIN(salario) AS menor_salario
FROM CLIENTES;
```

### Soma dos salários

```sql
SELECT SUM(salario) AS soma_salario
FROM CLIENTES;
```

---

# 📊 Consultas com GROUP BY

### Média salarial por cidade

```sql
SELECT cidade, AVG(salario)::NUMERIC(10,2) AS media_salarial
FROM CLIENTES
GROUP BY cidade;
```

### Maior e menor preço de venda por marca

```sql
SELECT marca,
MAX(preco_venda) AS max_venda,
MIN(preco_venda) AS min_venda
FROM VEICULOS
GROUP BY marca;
```

---

# 🛠 Tecnologias Utilizadas

* **PostgreSQL**
* **SQL**
* Modelagem de banco de dados relacional
* Consultas com **LIKE**, **ILIKE**, **funções agregadas** e **GROUP BY**

---

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

* Criação de tabelas
* Definição de **chaves primárias e estrangeiras**
* Inserção de dados
* Consultas SQL com filtros
* Funções de agregação
* Agrupamento de dados

---

# 👨‍💻 Autor

Projeto desenvolvido para **estudo de Banco de Dados e prática em PostgreSQL**.
