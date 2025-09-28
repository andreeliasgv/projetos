# 📚 Sistema de Multas de Biblioteca em Java

Este projeto implementa um **sistema simples para gerenciamento de multas de empréstimos de livros** em uma biblioteca. Ele calcula o valor da multa baseado no número de dias de atraso e no valor da multa diária.

---

## 📌 Descrição

O sistema é composto por duas partes principais:

1. **Classe `Biblioteca`**

   * Representa um empréstimo de livro com atributos:

     * `idEmprestimo` → identificador do empréstimo.
     * `nomeAluno` → nome do aluno que realizou o empréstimo.
     * `nomeLivro` → nome do livro emprestado.
     * `valorMultaDia` → valor da multa por dia de atraso.
     * `nroDiasAtraso` → número de dias de atraso na devolução.
     * `valorMultaPagar` → valor total da multa a ser pago.
   * Principais métodos:

     * `printValorMultaPagar()` → calcula e retorna o valor da multa com base nos dias de atraso.
     * `printBiblioteca()` → retorna uma string com as informações do empréstimo formatadas.

2. **Classe `Main`**

   * Gerencia a interação com o usuário:

     * Solicita dados do empréstimo.
     * Calcula a multa.
     * Exibe o resumo do empréstimo com o valor total da multa.

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
Informe o ID do emprestimo: 
101
Informe o nome do Aluno: 
Maria Silva
Informe o nome do Livro: 
Java Básico
Informe o valor da multa diária: 
2.5
Informe o numero de dias em atraso: 
4
```

### Saída

```text
ID do Emprestimo: 101
 Nome do Aluno: Maria Silva
 Nome do Livro: Java Básico
 Valor da Multa Diaria R$: 2.5
 Dias em atraso: 4

 Multa Total a pagar: R$10.0
```

---

## 📒 Observações e Boas Práticas

* O valor da multa é calculado **automaticamente** multiplicando o número de dias de atraso pelo valor diário da multa.
* O sistema é **didático** e serve como exercício de programação orientada a objetos.
* Pode ser expandido para:

  * Gerenciar múltiplos empréstimos simultaneamente.
  * Aplicar **diferentes políticas de multa** (por exemplo, multa progressiva).
  * Registrar **pagamentos de multas**.
  * Persistir os dados em **arquivos ou banco de dados**.

---

✍️ Desenvolvido como exercício prático de Java para gerenciamento de biblioteca e multas de empréstimo.
