# 📚 Sistema de Cadastro de Alunos em Java

Este projeto implementa um sistema simples de **cadastro de alunos** em Java, permitindo inserir dados de avaliações e calcular automaticamente médias parciais e a média final de cada aluno.

---

## 📌 Descrição

O programa é composto por duas partes principais:

1. **Classe `Aluno`**

   * Representa um aluno com os seguintes atributos:

     * `idAluno`
     * `nomeAluno`
     * Notas de trabalho e prova da **AV1** e **AV2**
     * Médias parciais e média final
   * Possui métodos de cálculo:

     * `calcularMediaAV1()`
     * `calcularMediaAV2()`
     * `calcularMediaFinal()`
   * Inclui o método `toString()` para exibir os dados do aluno de forma organizada.

2. **Classe `Main`**

   * Controla a execução do programa.
   * Exibe um menu interativo para:

     * **Adicionar alunos** com suas respectivas notas.
     * **Exibir todos os alunos cadastrados** com suas médias calculadas.
   * Utiliza `ArrayList` para armazenar os objetos da classe `Aluno`.

---

## ▶️ Como Executar

### 1. Requisitos

* **Java 8** ou superior instalado.
* Um compilador/IDE compatível:

  * IntelliJ IDEA
  * Eclipse
  * NetBeans
  * Ou apenas o terminal com `javac`.

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
Selecione uma opcao
1 - ADICIONAR ALUNO
2 - IMPRIMIR RESULTADOS

1
CADASTRAR ALUNO:
NOME: Maria Souza
NOTA TRABALHO AV1: 8.0
NOTA PROVA AV1: 7.0
NOTA TRABALHO AV2: 9.0
NOTA PROVA AV2: 8.0

Selecione uma opcao
1 - ADICIONAR ALUNO
2 - IMPRIMIR RESULTADOS

2
```

### Saída no Terminal

```text
========= ALUNOS CADASTRADOS =========

ALUNO
ID: 1
NOME: Maria Souza
NOTA TRABALHO AV1: 8.0
NOTA PROVA AV1: 7.0
MEDIA AV1: 7.5
NOTA TRABALHO AV2: 9.0
NOTA PROVA AV2: 8.0
MEDIA AV2: 8.5
MEDIA FINAL: 8.0

========= ALUNOS CADASTRADOS =========
```

---

## 📒 Observações e Boas Práticas

* As **médias parciais (AV1 e AV2)** são calculadas automaticamente assim que o aluno é cadastrado.
* A **média final** é a média aritmética entre as médias de AV1 e AV2.
* O sistema utiliza `Locale.US` para garantir que os números com casas decimais sejam inseridos com ponto (`.`) ao invés de vírgula (`,`).
* Em aplicações reais, recomenda-se validar notas (ex.: evitar valores negativos ou acima de 10).
* Este é um projeto **didático**, podendo ser expandido para:

  * Persistência em banco de dados
  * Relatórios estatísticos
  * Interface gráfica

---

✍️ Desenvolvido como exercício prático de programação orientada a objetos em Java.
