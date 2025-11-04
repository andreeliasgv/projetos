# 🔢 Contador

Este projeto Java é uma aplicação simples de linha de comando que realiza uma contagem com base em dois parâmetros fornecidos pelo usuário. Ele também demonstra o uso de exceções personalizadas para validação de entrada.

## 🎯 Objetivo

Praticar os seguintes conceitos da linguagem Java:

- Leitura de dados com `Scanner`
- Estruturas de repetição (`for`)
- Criação e uso de exceções personalizadas (`extends Exception`)
- Lógica de validação de parâmetros

## ⚙️ Como funciona

1. O programa solicita dois números inteiros ao usuário.
2. Verifica se o segundo número é maior que o primeiro.
3. Se for, realiza uma contagem do número 1 até a diferença entre os dois.
4. Caso contrário, lança uma exceção personalizada informando que os parâmetros são inválidos.

## 💻 Exemplo de execução

```
Digite o primeiro parâmetro:
3
Digite o segundo parâmetro
7
Imprimindo o numero: 1
Imprimindo o numero: 2
Imprimindo o numero: 3
Imprimindo o numero: 4
```

Se o segundo parâmetro for menor ou igual ao primeiro:

```
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro
3
O segundo parâmetro deve ser maior que o primeiro!
```

## 📦 Requisitos

- Java JDK 8 ou superior
- Terminal ou IDE compatível com Java

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/Contador.git
   ```
2. Compile o código:
   ```bash
   javac Contador.java
   ```
3. Execute o programa:
   ```bash
   java Contador
   ```

## 🛠️ Autor

Desenvolvido por [André Elias](https://github.com/andreeliasgv) como parte dos estudos de Java.

---

📌 Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
