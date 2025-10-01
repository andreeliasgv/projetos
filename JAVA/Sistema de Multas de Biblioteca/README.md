---

# 📚 Sistema de Multas de Biblioteca em Java

Este projeto implementa um **sistema de gerenciamento de multas de empréstimos de livros** em uma biblioteca.
Agora, além de calcular a multa de um único empréstimo, o sistema permite **registrar múltiplos empréstimos** em uma lista e exibir todos ao final da execução.

---

## 📌 Descrição

O sistema é composto por duas partes principais:

1. **Classe `Biblioteca`**

   * Representa um empréstimo de livro com atributos:

     * `idEmprestimo` → identificador único do empréstimo (gerado automaticamente).
     * `nomeAluno` → nome do aluno que realizou o empréstimo.
     * `nomeLivro` → nome do livro emprestado.
     * `valorMultaDia` → valor da multa por dia de atraso.
     * `nroDiasAtraso` → número de dias de atraso na devolução.
     * `valorMultaPagar` → valor total da multa a ser pago.
   * Principais métodos:

     * `calcularValorMultaPagar()` → calcula o valor da multa com base nos dias de atraso.
     * `toString()` → retorna uma string formatada com os dados do empréstimo.
     * `equals()` e `hashCode()` → garantem integridade e comparação correta entre empréstimos.

2. **Classe `Main`**

   * Responsável pela interação com o usuário:

     * Permite cadastrar múltiplos empréstimos em loop.
     * Armazena todos os registros em uma lista (`ArrayList`).
     * Exibe todos os empréstimos cadastrados ao final.

---

## ▶️ Como Executar

### 1. Requisitos

* **Java 8** ou superior.
* IDE compatível ou terminal com:

  * `javac`
  * `java`

### 2. Compilação e Execução no Terminal

```
# Compilar
javac Main.java

# Executar
java Main
```

---

## 🖥️ Exemplo de Uso

### Entrada do Usuário

```
Cadastro de Emprestimo
Aluno: Maria Silva
Nome do Livro: Java Básico
Valor da multa diaria: 2.5
Dias em atraso: 4
Deseja cadastrar outro emprestimo?
1-Sim
2-Nao
```

### Saída

```
ID do Emprestimo: 1
 Nome do Aluno: Maria Silva
 Nome do Livro: Java Básico
 Valor da Multa Diaria R$: 2.5
 Dias em atraso: 4
 Multa Total a pagar: R$10.0
```

---

## 📒 Observações e Boas Práticas

* Agora o sistema permite **cadastrar múltiplos empréstimos** em sequência.
* O valor da multa é calculado automaticamente multiplicando os dias de atraso pelo valor diário.
* O programa é **didático** e pode ser expandido para:

  * Aplicar políticas de multa diferenciadas (ex.: progressivas).
  * Registrar pagamentos de multas.
  * Persistir os dados em arquivos ou banco de dados.
  * Implementar interface gráfica ou API para integração.

---

✍️ Desenvolvido como exercício prático de Java para gerenciamento de biblioteca e multas de empréstimo.

---
