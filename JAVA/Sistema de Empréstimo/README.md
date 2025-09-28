# 💰 Sistema de Empréstimo em Java

Este projeto implementa um sistema simples de **gerenciamento de empréstimos** em Java. Ele permite cadastrar um cliente, registrar seu empréstimo, calcular o valor de cada parcela e gerenciar o pagamento delas de forma interativa.

---

## 📌 Descrição

O sistema é composto por duas partes principais:

1. **Classe `Emprestimo`**

   * Representa um contrato de empréstimo com atributos como:

     * Cliente
     * Banco
     * Valor do empréstimo
     * Número de parcelas
     * Valor de cada parcela
     * Valores pagos e pendentes
   * Principais métodos:

     * `valorParcela()` → calcula o valor de cada parcela com base no total e no número de parcelas.
     * `pagarParcela(int parcelas)` → registra o pagamento de uma ou mais parcelas.
     * `toString()` → gera um resumo detalhado do contrato.

2. **Classe `Main`**

   * Gerencia a interação com o usuário.
   * Permite:

     * Cadastrar um contrato de empréstimo.
     * Exibir as informações do contrato.
     * Pagar parcelas de forma interativa até encerrar a execução.

---

## ▶️ Como Executar

### 1. Requisitos

* **Java 8** ou superior instalado.
* IDE ou terminal configurado:

  * IntelliJ IDEA
  * Eclipse
  * NetBeans
  * Ou apenas `javac` e `java` no terminal.

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
Nome: João Silva
Banco: Banco XPTO
Valor do Emprestimo: 1200
Numero de Parcelas: 6
```

### Saída Inicial

```text
EMPRESTIMO 
Cliente: João Silva
Banco: Banco XPTO
Valor do Emprestimo: 1200.0
Numero de Parcelas: 6
Valor da Parcela: R$200.0
Valor Pago: R$0.0
Valor Pendente: R$1200.0
```

### Menu Interativo

```text
Selecione uma opcao:
1 - Pagar Parcela
2 - Extrato Contrato
9 - Sair
```

#### Exemplo de Pagamento

```text
Informe a quantidade de parcelas a pagar:
2

 2 Parcela(s) paga(s) com sucesso!

EMPRESTIMO 
Cliente: João Silva
Banco: Banco XPTO
Valor do Emprestimo: 1200.0
Numero de Parcelas: 6
Valor da Parcela: R$200.0
Valor Pago: R$400.0
Valor Pendente: R$800.0
```

---

## 📒 Observações e Boas Práticas

* O valor das parcelas é **calculado automaticamente** ao informar o valor do empréstimo e o número de parcelas.
* O método `pagarParcela` garante que não sejam pagas mais parcelas do que o saldo pendente.
* É possível expandir o código para:

  * **Calcular juros compostos ou simples**.
  * **Armazenar múltiplos empréstimos**.
  * **Persistir dados em banco de dados ou arquivos**.
* O sistema utiliza `Locale.US`, portanto números decimais devem ser digitados com ponto (`.`) e não com vírgula (`,`).

---

✍️ Desenvolvido como exercício prático de programação orientada a objetos em Java.

---
