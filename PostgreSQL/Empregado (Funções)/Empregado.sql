CREATE TABLE EMPREGADO (
    id INT PRIMARY KEY,
    nome VARCHAR(50),
    departamento VARCHAR(50),
    salario DECIMAL(10,2)
);

INSERT INTO EMPREGADO VALUES (1, 'Ana', 'Financeiro', 2500.00);
INSERT INTO EMPREGADO VALUES (2, 'Bruno', 'RH', 3200.00);
INSERT INTO EMPREGADO VALUES (3, 'Carlos', 'TI', 4500.00);
INSERT INTO EMPREGADO VALUES (4, 'Daniela', 'TI', 4500.00);
INSERT INTO EMPREGADO VALUES (5, 'Eduardo', 'Financeiro', 2800.00);
INSERT INTO EMPREGADO VALUES (6, 'Fernanda', 'RH', 3100.00);
INSERT INTO EMPREGADO VALUES (7, 'Gabriel', 'TI', 5200.00);
INSERT INTO EMPREGADO VALUES (8, 'Helena', 'Financeiro', 2600.00);

SELECT * FROM EMPREGADO;

/*

5. Consultas com agrupamento e funções agregadas
Na tabela EMPREGADO, elabore consultas para:

calcular a média salarial;
contar quantos funcionários existem;
mostrar o maior e o menor salário;
somar todos os salários;
listar salários distintos, sem repetição.

*/

-- calcular a média salarial;
SELECT CAST (AVG(SALARIO) AS DECIMAL(10,2)) AS "Média Salarial" FROM EMPREGADO;

-- contar quantos funcionários existem;
SELECT COUNT(ID) AS "Número de Empregados" FROM EMPREGADO;

-- mostrar o maior e o menor salário;
SELECT MAX(SALARIO) AS "Maior salário", MIN(SALARIO) AS "Menor salário" FROM EMPREGADO;

-- somar todos os salários;
SELECT CAST (SUM(SALARIO) AS NUMERIC(10,2)) AS "Soma dos salários" FROM EMPREGADO;

-- listar salários distintos, sem repetição.
SELECT DISTINCT(SALARIO) FROM EMPREGADO;