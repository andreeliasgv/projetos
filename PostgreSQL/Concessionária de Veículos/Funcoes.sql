-- 1) Selecione todos os clientes cujo nome começa com a letra A.
SELECT * FROM CLIENTES WHERE nome LIKE 'A%';

-- 2) Liste os clientes cujo nome contém a letra "i" em qualquer posição.
SELECT * FROM CLIENTES WHERE nome LIKE '%i%';

-- 3) Selecione os clientes cujo nome termina com a letra "a".
SELECT * FROM CLIENTES WHERE nome LIKE '%a';

-- 4) Liste os clientes cujo nome tenha exatamente 5 caracteres.
SELECT * FROM CLIENTES WHERE nome LIKE '_____';

-- 5) Selecione os clientes cujo nome começa com "Ma" e termina com "a".
SELECT * FROM CLIENTES WHERE nome LIKE 'Ma%a';

-- 6) Liste os veículos cuja cor seja BRANCO.
SELECT * FROM VEICULOS WHERE cor='BRANCO';

-- 7) Selecione os veículos cujo modelo contenha "O".
SELECT * FROM VEICULOS WHERE modelo LIKE '%O%';

-- 8) Liste os veículos cuja placa termine com "9".
SELECT * FROM VEICULOS WHERE placa LIKE '%9';

-- 9) Selecione os clientes cujo endereço contenha "RUA 01".
SELECT * FROM CLIENTES WHERE endereco LIKE '%RUA 01%';

-- 10) Repita o exercício 2 usando ILIKE para não diferenciar maiúsculas e minúsculas.
-- (Liste os clientes cujo nome contém a letra "i" em qualquer posição.)
SELECT * FROM CLIENTES WHERE nome ILIKE '%i%';

-- 11) Calcule a média dos salários dos clientes.
SELECT AVG(salario)::NUMERIC(10,2) AS media_salarios
FROM CLIENTES;

--12) Conte quantos clientes existem na tabela.
SELECT COUNT(CLIENTES) FROM CLIENTES;

-- 13) Conte quantos clientes moram na cidade de FERNANDÓPOLIS.
SELECT COUNT(CLIENTES) AS moram_fernandopolis FROM CLIENTES WHERE cidade = 'FERNANDOPOLIS';

-- 14) Selecione o maior salário entre os clientes.
SELECT MAX(salario) AS maior_salario FROM CLIENTES;

-- 15) Selecione o menor salário entre os clientes.
SELECT MIN(salario) AS menor_salario FROM CLIENTES;

-- 16) Calcule a soma dos salários de todos os clientes.
SELECT SUM(salario) AS soma_salario FROM CLIENTES;

-- 17) Selecione o maior preço de venda dos veículos.
SELECT MAX(preco_venda) AS maior_venda FROM VEICULOS;

-- 18) Selecione o menor preço de compra dos veículos.
SELECT MIN(preco_compra) AS menor_compra FROM VEICULOS;

-- 19) Liste a média salarial por cidade.
SELECT cidade, AVG(salario)::NUMERIC(10,2) AS media_salarial FROM CLIENTES GROUP BY(cidade);

-- 20) Mostre o maior e menor preço de venda por marca de veículo.
SELECT marca, MAX(preco_venda) AS max_venda, MIN(preco_venda) AS min_venda FROM VEICULOS GROUP BY(marca);