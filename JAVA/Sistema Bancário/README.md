# 🏦 Sistema Bancário em Java

Este projeto implementa um **sistema simples de conta bancária** em Java, permitindo gerenciar depósitos, saques e consultar informações de uma conta de forma interativa.

---

## 📌 Descrição

O sistema é composto por duas partes principais:

1. **Classe `Conta`**

   * Representa uma conta bancária com atributos:

     * `banco`
     * `numeroAgencia`
     * `numeroConta`
     * `saldoAtual`
   * Principais métodos:

     * `depositar(double valor)` → adiciona valor ao saldo atual.
     * `sacar(double valor)` → realiza saque se houver saldo suficiente; caso contrário, retorna mensagem de saldo insuficiente.
     * `toString()` → retorna uma string formatada com todas as informações da conta.

2. **Classe `Main`**

   * Controla a execução do programa e interação com o usuário.
   * Permite:

     * Depositar valores na conta.
     * Sacar valores da conta.
     * Consultar informações da conta.
     * Sair do sistema.

* O programa utiliza `Scanner` e `Locale.US` para entrada de dados numéricos com ponto decimal.

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
Informe seu banco:
Banco XPTO
Informe o numero da agencia: 
1234
Informe o numero da sua conta: 
56789

Escolha uma opcao: 
1 - DEPOSITAR
2 - SACAR
3 - CONSULTAR INFORMACOES
4 - SAIR

1
Informe a quantia para deposito: 
500
```

### Saída Após Depósito

```text
Deposito concluIdo com sucesso!

CONTA BANCARIA
Banco: Banco XPTO
Numero da Agencia: 1234
Numero da Conta: 56789
Saldo Atual: R$500.00
```

### Menu de Operações

```text
Escolha uma opcao: 
1 - DEPOSITAR
2 - SACAR
3 - CONSULTAR INFORMACOES
4 - SAIR

2
Informe a quantia para saque: 
200

Saque concluido com sucesso!

3
CONTA BANCARIA
Banco: Banco XPTO
Numero da Agencia: 1234
Numero da Conta: 56789
Saldo Atual: R$300.00
```

---

## 📒 Observações e Boas Práticas

* O sistema valida se há **saldo suficiente antes de permitir saque**.
* O saldo é exibido sempre formatado com **duas casas decimais**.
* Para entradas numéricas decimais, utilize **ponto (`.`) como separador**.
* Este código pode ser expandido para:

  * Gerenciar múltiplas contas simultaneamente.
  * Implementar transferência entre contas.
  * Persistir dados em arquivos ou banco de dados.
* O sistema é **didático** e serve como exercício de programação orientada a objetos.

---

✍️ Desenvolvido como exercício prático de Java para operações bancárias básicas.
