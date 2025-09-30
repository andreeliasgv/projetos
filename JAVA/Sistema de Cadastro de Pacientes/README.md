# Sistema de Cadastro de Pacientes em Java

## 📌 Funcionalidades

Este projeto implementa um **sistema de cadastro de pacientes** em Java.
Ele permite registrar pacientes com informações de **ID, nome, idade e diagnóstico**, armazenando-os em uma lista e exibindo todos os registros ao final da execução.

A lógica principal funciona da seguinte forma:

1. O usuário informa os dados de cada paciente.
2. O sistema atribui automaticamente um **ID sequencial** a cada novo cadastro.
3. Os dados são armazenados em uma lista de objetos da classe `Paciente`.
4. Ao final, todos os pacientes cadastrados são exibidos no console, juntamente com a quantidade total de registros.

## 🛠️ Estrutura do Código

* **Classe `Paciente`**

  * Contém atributos: `id`, `nome`, `diagnostico` e `idade`.
  * Inclui métodos **getters e setters**, além de sobrescrita de `toString()`, `equals()` e `hashCode()`.
* **Classe `Main`**

  * Responsável pela interação com o usuário via **Scanner**.
  * Permite inserir dados de pacientes em loop até que o usuário opte por parar.
  * Armazena os pacientes em uma **`ArrayList<Paciente>`**.

## ▶️ Como Executar

1. Salve o código em um arquivo chamado `Main.java`.
2. Compile o código no terminal com:

   ```
   javac Main.java
   ```
3. Execute o programa:

   ```
   java Main
   ```
4. Siga as instruções exibidas no console para cadastrar os pacientes.

## 📥 Exemplo de Entrada

```
CADASTRO DE PACIENTE:
Nome: João Silva
Idade: 30
Diagnostico: Gripe

Deseja cadastrar outro paciente?
1 - Sim.
2 - Nao.
```

## 📤 Exemplo de Saída

```
PACIENTES
ID: 1
Nome: João Silva
Diagnostico: Gripe
Idade: 30

Pacientes Cadastrados: 1
```

## 📌 Observações

* O **ID** é gerado automaticamente em ordem sequencial.
* A classe `Paciente` utiliza `equals()` e `hashCode()` para garantir integridade de objetos.
* O programa roda diretamente no **console** e não possui interface gráfica.
* É possível cadastrar quantos pacientes forem necessários até selecionar a opção de encerrar.
