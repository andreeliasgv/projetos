# 🧮 Calcular Idade em Java

Este é um programa simples em Java que solicita ao usuário o ano do seu nascimento e o ano do seu último
aniversário, calcula sua idade em **anos, meses e dias**, e ainda informa se a pessoa é **maior ou menor de idade**.
````markdown

## 📌 Funcionalidades

- Solicita o ano de nascimento e o ano do último aniversário
- Calcula:
  - Idade em anos
  - Idade aproximada em meses
  - Idade aproximada em dias
- Verifica se o usuário é maior ou menor de idade (18 anos como referência)

## 📂 Estrutura


double aniversario, nascimento, anos, meses, dias;

* `nascimento`: ano de nascimento do usuário
* `aniversario`: ano atual ou do último aniversário
* `anos`, `meses`, `dias`: cálculos derivados da diferença entre os anos

## 🖥️ Exemplo de uso

```
Informe o ano do seu nascimento: 
2005
Informe o ano do seu último aniversário: 
2025

Sua idade é: 
20.0 anos ou
240.0 meses ou
7300.0 dias.
Você é maior de idade.
```

## 🧠 Observações

* Os meses e dias são **aproximados** (365 dias por ano, sem considerar anos bissextos ou meses com variações).
* Ideal para iniciantes treinarem **entrada de dados**, **operações básicas** e **estrutura condicional `if/else`**.

## 📄 Licença

Este projeto está sob a [Licença MIT](../LICENSE).
