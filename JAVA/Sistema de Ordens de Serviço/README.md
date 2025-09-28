# 🧾 Sistema de Ordens de Serviço em Java

Este projeto implementa um sistema simples de **ordens de serviço (OS)** em Java, permitindo o cadastro de informações de clientes, profissionais, valores de serviços, deslocamentos e cálculo automático do valor total a pagar.

---

## 📌 Descrição

O programa é dividido em duas partes principais:

1. **Classe `OrdemServico`**  
   - Representa uma ordem de serviço com atributos como:
     - Cliente
     - Profissional
     - Valor da hora de serviço
     - Valor do km de deslocamento
     - Horas trabalhadas
     - Quilometragem percorrida
     - Cálculo de valores (serviço, deslocamento e total)
   - Possui métodos para calcular automaticamente:
     - `calcularValorServico()`
     - `calcularValorDeslocamento()`
     - `calcularValorPagar()`
   - Inclui sobrescritas de `toString()`, `equals()` e `hashCode()` para melhor representação e comparação de objetos.

2. **Classe `Main`**  
   - Responsável pela execução do programa.
   - Utiliza **entrada do usuário via teclado** para coletar os dados da ordem de serviço.
   - Permite cadastrar várias ordens de serviço.
   - Ao final, exibe todas as ordens cadastradas com seus respectivos cálculos.

---

## ▶️ Como Executar

### 1. Requisitos
- **Java 8** ou superior instalado.
- Um compilador/IDE compatível, como:
  - IntelliJ IDEA
  - Eclipse
  - NetBeans
  - Ou apenas o terminal com `javac`.

### 2. Compilação e Execução no Terminal

````bash
# Compilar
javac Main.java

# Executar
java Main
````

---

## 🖥️ Exemplo de Uso

### Entrada do Usuário

```
Nome do Cliente: João da Silva
Nome do Profissional: Pedro Oliveira
Valor da Hora do Servico: 50
Valor do KM Deslocado: 2
Horas Trabalhadas: 8
KM Percorridos: 15
Deseja informar outra ordem?
1- Sim.
2- Nao.
```

### Saída no Terminal

```
ORDEM DE SERVICO
ID: 1738261327
Cliente: João da Silva
Profissional: Pedro Oliveira
Valor da Hora do Servico: 50.0
Valor do Km Deslocado: 2.0
Numero de Horas Trabalhadas: 8.0
KM Percorrido: 15.0
Valor do Servico: R$400.0
Valor do Deslocamento: R$30.0
Total a Pagar: R$430.0
```

---

## 📒 Observações e Boas Práticas

* O **ID da ordem** é gerado automaticamente a partir do método `hashCode()`.
* É importante validar entradas de usuário em sistemas reais (ex.: valores negativos ou nulos).
* Este código é um **exemplo didático**, podendo ser expandido para:

  * Persistência em banco de dados
  * Interface gráfica ou API
  * Relatórios mais completos

---

✍️ Desenvolvido como exercício de programação orientada a objetos em Java.

```
```
