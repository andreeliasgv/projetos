# 📱 Projeto Java – Implementação de Interfaces (Reprodutor, Telefone e Navegador)

## 📌 Descrição do Projeto

Este projeto em **Java** demonstra a implementação de múltiplas interfaces — **ReprodutorMusical**, **Telefone** e **Navegador** — presentes no pacote `feature`.
A classe `Iphone`, localizada no pacote `model`, implementa todas essas interfaces e sobrescreve (**@Override**) seus métodos, simulando o comportamento básico de um smartphone.

A execução do programa ocorre na classe `Main`, dentro do pacote `main`, onde uma instância de `Iphone` é criada e todos os seus métodos são demonstrados.

---

## 📂 Estrutura do Projeto

```
src/
 ├── feature/
 │    ├── Navegador.java
 │    ├── ReprodutorMusical.java
 │    └── Telefone.java
 ├── model/
 │    └── Iphone.java
 └── main/
      └── Main.java
```

---

## 🧠 Lógica de Funcionamento

### **Interfaces**

* **ReprodutorMusical**

  * tocar()
  * pausar()
  * selecionarMusica(String música)

* **Telefone**

  * ligar(String número)
  * atender()
  * iniciarCorreioVoz()

* **Navegador**

  * exibirPagina(String url)
  * adicionarNovaAba()
  * atualizarPagina()

Cada interface define comportamentos específicos de um dispositivo.
A classe `Iphone` implementa todas elas, simulando um dispositivo multifuncional.

### **Classe Iphone**

A classe implementa os três conjuntos de funcionalidades, exibindo mensagens no console para representar cada ação realizada.

### **Classe Main**

Instancia um `Iphone` e aciona todos os métodos implementados, gerando uma simulação completa de uso.

---

## ▶️ Como Executar o Projeto

### **Pré-requisitos**

* Java JDK 8+ instalado
* IDE (opcional): IntelliJ, Eclipse, VS Code, NetBeans, etc.

### **Passos para executar**

1. Clone este repositório ou copie os arquivos para um diretório.
2. Garanta que a estrutura de pacotes está correta (`feature`, `model`, `main`).
3. Compile o projeto pelo terminal ou IDE.

#### ✔️ Compilar via terminal:

```
javac feature/*.java model/*.java main/*.java
```

#### ✔️ Executar:

```
java main.Main
```

---

## 🧪 Exemplo de Saída no Terminal

```
A musica Back in Black foi selecionada.
Tocando musica.
Reproducao pausada
Ligando para 99462-4537
Chamada atendida.
Iniciando correio de voz...
Acessando https://www.google.com
Nova aba adicionada.
Atualizando pagina...
```

---

## 📘 Código-Fonte

### **Interfaces**

#### ReprodutorMusical.java

```
package feature;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);
}
```

#### Telefone.java

```
package feature;

public interface Telefone {
    public void ligar(String numero);
    public void atender();
    public void iniciarCorreioVoz();
}
```

#### Navegador.java

```
package feature;

public interface Navegador {
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
}
```

### **Classe Iphone**

```
package model;

import feature.Navegador;
import feature.ReprodutorMusical;
import feature.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Reproducao pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica " + musica + " foi selecionada.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
```

### **Classe Main**

```
package main;

import model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Back in Black");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("99462-4537");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
```
<br/><br/>
Desenvolvido com NetBeansIDE.
