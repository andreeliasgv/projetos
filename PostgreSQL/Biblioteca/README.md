# 📚 Sistema de Banco de Dados — Biblioteca

Este projeto apresenta a modelagem e implementação de um **banco de dados relacional para gerenciamento de uma biblioteca**, utilizando **SQL**. O objetivo é organizar informações sobre **livros, autores e categorias**, permitindo relacionamentos entre essas entidades.

---

# 🗂 Estrutura do Banco de Dados

O banco de dados é composto por **quatro tabelas principais**:

## 1. Autores

Armazena informações sobre os autores dos livros.

| Campo         | Tipo         | Descrição                    |
| ------------- | ------------ | ---------------------------- |
| id_autor      | INT          | Identificador único do autor |
| nome          | VARCHAR(100) | Nome do autor                |
| nacionalidade | VARCHAR(50)  | Nacionalidade do autor       |

---

## 2. Categorias

Armazena os diferentes gêneros ou categorias literárias.

| Campo         | Tipo         | Descrição                  |
| ------------- | ------------ | -------------------------- |
| cod_categoria | INT          | Identificador da categoria |
| descricao     | VARCHAR(100) | Nome da categoria          |

Exemplos de categorias:

* Fantasia
* Ficção Científica
* Romance
* Poesia
* Suspense
* História
* Filosofia
* Terror
* Biografia

---

## 3. Livros

Contém as informações dos livros disponíveis na biblioteca.

| Campo         | Tipo         | Descrição                    |
| ------------- | ------------ | ---------------------------- |
| isbn          | VARCHAR(20)  | Identificador único do livro |
| titulo        | VARCHAR(150) | Título do livro              |
| ano           | INT          | Ano de publicação            |
| editora       | VARCHAR(100) | Editora responsável          |
| cod_categoria | INT          | Categoria do livro           |

Cada livro pertence a **uma categoria**, definida por uma **chave estrangeira**.

---

## 4. Livros_Autores

Tabela associativa responsável por relacionar **livros e autores**.

Esse relacionamento é **muitos-para-muitos**, pois:

* Um livro pode ter vários autores
* Um autor pode escrever vários livros

| Campo    | Tipo        | Descrição         |
| -------- | ----------- | ----------------- |
| isbn     | VARCHAR(20) | Livro relacionado |
| id_autor | INT         | Autor relacionado |

A chave primária é **composta**:

```
PRIMARY KEY (isbn, id_autor)
```

---

# 🔗 Relacionamentos

O banco possui os seguintes relacionamentos:

* **Categorias → Livros**

  * Um para muitos (1:N)

* **Livros → Autores**

  * Muitos para muitos (N:N)
  * Implementado pela tabela `livros_autores`

---

# 🧩 Exemplo de Dados Inseridos

O banco inclui dados de autores famosos, como:

* J.K. Rowling
* George R.R. Martin
* J.R.R. Tolkien
* Machado de Assis
* Clarice Lispector
* Stephen King
* Agatha Christie
* Paulo Coelho
* Isaac Asimov

Também contém livros conhecidos, como:

* *Harry Potter e a Pedra Filosofal*
* *A Guerra dos Tronos*
* *O Senhor dos Anéis*
* *Dom Casmurro*
* *It: A Coisa*
* *Fundação*
* *Sapiens: Uma Breve História da Humanidade*

---

# 🧠 Exemplos de Consultas SQL

### Listar todos os livros com suas categorias

```sql
SELECT livros.titulo, categorias.descricao
FROM livros
JOIN categorias
ON livros.cod_categoria = categorias.cod_categoria;
```

---

### Listar livros com seus autores

```sql
SELECT livros.titulo, autores.nome
FROM livros
JOIN livros_autores ON livros.isbn = livros_autores.isbn
JOIN autores ON livros_autores.id_autor = autores.id_autor;
```

---

### Listar autores brasileiros

```sql
SELECT nome
FROM autores
WHERE nacionalidade = 'Brasileira';
```

---

# 🛠 Tecnologias Utilizadas

* SQL
* Banco de dados relacional
* Modelagem de dados (DER)
* Conceitos de chave primária e estrangeira

---

# 📖 Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

* Modelagem de banco de dados
* Criação de tabelas com SQL
* Relacionamentos entre entidades
* Uso de chaves primárias e estrangeiras
* Inserção e consulta de dados

---

# 👨‍💻 Autor

Projeto desenvolvido para fins **acadêmicos e de estudo de banco de dados**.
