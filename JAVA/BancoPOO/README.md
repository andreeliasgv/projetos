# 🏦 BancoPOO — Sistema Bancário Orientado a Objetos em Java

## 📌 Descrição do Projeto

**BancoPOO** é um projeto desenvolvido em Java com foco em **Programação Orientada a Objetos (POO)**.
O sistema simula operações bancárias fundamentais — como **depósito**, **saque**, **transferência** e **emissão de extrato** — utilizando conceitos como:

* Classes e Objetos
* Herança
* Polimorfismo
* Encapsulamento
* Interfaces
* Composição entre objetos (Banco, Cliente, Conta)

O projeto implementa dois tipos de conta:
✔ **ContaCorrente**
✔ **ContaPoupanca**

Ambas herdam da classe abstrata **Conta**, que contém toda a lógica principal.

---

## 📂 Estrutura de Diretórios

```
src/
 ├── main/
 │    └── Main.java
 └── model/
      ├── Banco.java
      ├── Cliente.java
      ├── Conta.java
      ├── ContaCorrente.java
      ├── ContaPoupanca.java
      └── InterfaceConta.java
```

---

## ▶️ Funcionamento Geral

No método `main`, o programa:

1. Cria um **Banco Itau**.
2. Cria um **Cliente André**.
3. Abre uma **Conta Corrente** no Itaú e deposita R$40.000.
4. Cria um **Banco do Brasil**.
5. Abre uma **Conta Poupança** no Banco do Brasil e deposita R$10.000.
6. Realiza uma **transferência de R$5.000** da conta corrente para a poupança.
7. Imprime os extratos de ambas as contas.

---

## 🧪 Exemplo de Saída no Terminal

```
EXTRATO:
Titular: Andre
Banco: Itau
Agencia: 1
Numero: 1
Saldo: R$35000.00

EXTRATO:
Titular: Andre
Banco: Banco do Brasil
Agencia: 1
Numero: 2
Saldo: R$15000.00
```

---

## 🧠 Principais Conceitos Aplicados

* **Herança:**
  `ContaCorrente` e `ContaPoupanca` estendem `Conta`.

* **Interface:**
  `InterfaceConta` define o contrato de operações bancárias.

* **Encapsulamento:**
  Atributos privados, acessados por métodos públicos.

* **Polimorfismo:**
  Objetos do tipo `Conta` podem referenciar contas correntes ou poupança.

* **Composição:**
  Uma Conta pertence a um Banco e a um Cliente.

---

## 📘 Código-Fonte

### Main.java

```
package main;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        
        Banco itau = new Banco("Itau");
        Cliente andre = new Cliente("Andre");
        Conta cc = new ContaCorrente(itau, andre);
        cc.depositar(40000d);
        
        Banco bb = new Banco("Banco do Brasil");
        Conta cp = new ContaPoupanca(bb, andre);
        cp.depositar(10000d);
        
        cc.transferir(cp, 5000d);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
```

---

### Conta.java

```
package model;

public abstract class Conta implements InterfaceConta {
    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;
    private Banco banco;
    
    public Conta(Banco banco, Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
        this.banco = banco;
        this.cliente = cliente;
    }

    public Integer getAgencia() { return agencia; }
    public Integer getNumero() { return numero; }
    public Double getSaldo() { return saldo; }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: R$" + this.getSaldo());
        }
    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {
        if (valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: R$" + this.getSaldo());
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO:");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f\n", this.saldo));
    }
}
```

---

### InterfaceConta.java

```
package model;

public interface InterfaceConta {
    void depositar(Double valor);
    void sacar(Double valor);
    void transferir(Conta contaDestino, Double valor);
    void imprimirExtrato();
}
```

---

### ContaCorrente.java

```
package model;

public class ContaCorrente extends Conta {
    public ContaCorrente(Banco banco, Cliente cliente){
        super(banco, cliente);
    }
}
```

---

### ContaPoupanca.java

```
package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Banco banco, Cliente cliente){
        super(banco, cliente);
    }
}
```

---

### Cliente.java

```
package model;

public class Cliente {
    private String nome;
    
    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
```

---

### Banco.java

```
package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList();
    }
    
    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
    
    public void removerConta(Conta conta){
        if (this.contas.contains(conta)) {
            this.contas.remove(conta);
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public void listarContas(){
        for(Conta c : contas) {
            c.getNumero();
        }
    }
}
```

---

## 🚀 Como Executar

1. Certifique-se de ter **Java 8+** instalado.
2. Compile os arquivos:

```
javac main/*.java model/*.java
```

3. Execute:

```
java main.Main
```

---

## 📜 Licença

Este projeto é livre para estudos e fins educacionais.
