CREATE TABLE PRODUTO (
	COD_PROD INTEGER NOT NULL,
	NOME VARCHAR(50),
	DESCRICAO VARCHAR (50),
	COD_LOTE INTEGER,
	CONSTRAINT PK_COD_PRODUTO PRIMARY KEY (COD_PRODUTO)
);

CREATE TABLE LOTE(
	COD_LOTE INTEGER NOT NULL,
	NOME_LOTE VARCHAR (50),
	CONSTRAINT PK_COD_LOTE PRIMARY KEY (COD_LOTE)
);

ALTER TABLE PRODUTO ADD CONSTRAINT FK_COD_LOTE1 FOREIGN KEY
(COD_LOTE) REFERENCES LOTE (COD_LOTE);

/*

ATIVIDADE

1. Alterando a estrutura de uma tabela
Considere a tabela PRODUTO já criada. Escreva os comandos SQL para:

adicionar a coluna preco_promocional do tipo decimal;
remover a coluna descricao;
renomear a coluna cod_prod para cod_produto;
renomear a tabela produto para itens.

*/

-- adicionar a coluna preco_promocional do tipo decimal;
ALTER TABLE PRODUTO
ADD COLUMN PRECO_PROMOCIONAL DECIMAL;

-- remover a coluna descricao;
ALTER TABLE PRODUTO
DROP COLUMN DESCRICAO;

-- renomear a coluna cod_prod para cod_produto;
ALTER TABLE PRODUTO
RENAME COLUMN COD_PROD TO COD_PRODUTO;

-- renomear a tabela produto para itens.
ALTER TABLE PRODUTO
RENAME TO ITENS;

/*

4. Filtrando dados com condições
Usando a tabela ITENS, crie consultas que retornem:

produtos com preço promocional entre 0.50 e 2.00;
produtos com preço promocional 0.11, 1.80 ou 2.00;
produtos cujo nome comece com a letra A;
produtos cujo nome contenha a letra a.

*/

INSERT INTO LOTE VALUES
	(10, 'Lote de Armarinho'),
	(20, 'Lote de Papelaria'),
	(30, 'Lote de Escritório'),
	(40, 'Lote de Informática');

INSERT INTO ITENS VALUES
	(1, 'Agulha', 10, 0.11),
	(2, 'Alfinete', 10, 1.80),
	(3, 'Apontador', 20, 2.00),
	(4, 'Borracha', 20, 0.50),
	(5, 'Caneta', 30, 1.20),
	(6, 'Lápis', 30, 0.75),
	(7, 'Monitor', 40, 500.00);

-- produtos com preço promocional entre 0.50 e 2.00;
SELECT * FROM ITENS WHERE PRECO_PROMOCIONAL BETWEEN 0.5 AND 2;

-- produtos com preço promocional 0.11, 1.80 ou 2.00;
SELECT * FROM ITENS WHERE PRECO_PROMOCIONAL = 0.11 OR PRECO_PROMOCIONAL = 1.80 OR PRECO_PROMOCIONAL = 2;

-- produtos cujo nome comece com a letra A;
SELECT * FROM ITENS WHERE NOME ILIKE 'A%';

-- produtos cujo nome contenha a letra a.
SELECT * FROM ITENS WHERE NOME ILIKE '%a%';