# 🚗 Sistema de Cadastro de Veículos em Java

Este projeto implementa um **sistema simples para cadastro de veículos**, permitindo armazenar e exibir informações como marca, modelo, ano e valor de venda.

---

## 📌 Descrição

O sistema é composto por duas partes principais:

1. **Classe `Vehicle`**

   * Representa um veículo com atributos:

     * `id` → identificador do veículo.
     * `marca` → marca do veículo.
     * `modelo` → modelo do veículo.
     * `ano` → ano de fabricação do veículo.
     * `valorVenda` → valor de venda do veículo.
   * Principais métodos:

     * `printVehicle()` → retorna uma string com as informações do veículo formatadas.

2. **Classe `Main`**

   * Controla a interação com o usuário:

     * Solicita os dados do veículo.
     * Cria um objeto `Vehicle` e preenche seus atributos.
     * Exibe os detalhes do veículo cadastrado.

* O programa utiliza `Scanner` para entrada de dados do usuário.

---

## ▶️ Como Executar

### 1. Requisitos

* **Java 8** ou superior.
* IDE compatível ou terminal com:

  * `javac`
  * `java`

### 2. Compilação e Execução no Terminal

```bash
# Compilar
javac Main.java

# Executar
java Main
```

---

## 🖥️ Exemplo de Uso

### Entrada do Usuário

```text
Informe o ID do veiculo: 
1
Informe a marca do veiculo: 
Toyota
Informe o modelo do veiculo: 
Corolla
Informe o ano do veiculo: 
2023
Informe o valor de venda do veiculo: 
150000
```

### Saída

```text
Vehicle ID: 1
 Brand: Toyota
 Model: Corolla
 Color: 2023
 Sell Price: 150000.0
```

---

## 📒 Observações e Boas Práticas

* O sistema permite cadastrar apenas **um veículo por execução**; para cadastrar múltiplos veículos, seria necessário criar uma lista ou um banco de dados.
* O atributo `ano` é tratado como `String` para permitir flexibilidade (ex.: "2023/2024").
* Este código é **didático** e serve como exercício de programação orientada a objetos.
* Possíveis melhorias:

  * Gerenciar múltiplos veículos em uma coleção (`ArrayList` ou `HashMap`).
  * Implementar métodos para atualizar ou remover veículos.
  * Adicionar validação de entrada para valores e ano.

---

✍️ Desenvolvido como exercício prático de Java para cadastro e gerenciamento básico de veículos.
