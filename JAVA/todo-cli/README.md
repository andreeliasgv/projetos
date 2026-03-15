# ✅ To-Do List CLI — Java

Projeto de **gerenciamento de tarefas em linha de comando (CLI)** desenvolvido em **Java**.
O sistema permite **criar, listar, concluir, remover e filtrar tarefas por tag**, utilizando uma estrutura simples baseada em **POO (Programação Orientada a Objetos)**.

Este projeto foi desenvolvido com fins **educacionais e de prática de lógica, estrutura de dados e organização de código em camadas**.

---

# 📌 Funcionalidades

O sistema oferece as seguintes operações:

* ➕ **Adicionar tarefa**
* 📋 **Listar todas as tarefas**
* ✔ **Marcar tarefa como concluída**
* ❌ **Remover tarefa**
* 🔎 **Filtrar tarefas por tag**
* 🚪 **Encerrar o programa**

---

# 🧠 Estrutura do Projeto

O projeto segue uma organização simples baseada em **camadas**:

```
src
 └── com
     └── todo
         ├── app
         │    └── Main.java
         │
         ├── model
         │    └── Task.java
         │
         └── service
              └── TaskService.java
```

### 📂 `app`

Contém a **classe principal** que executa o programa e controla o menu.

```java
public class Main {
    public static void main(String[] args) {
        // inicialização da aplicação
    }
}
```

---

### 📂 `model`

Responsável pela **estrutura da entidade Task**.

A classe contém:

* `id`
* `descricao`
* `concluida`
* `tag`

Exemplo de criação de uma tarefa:

```java
Task tarefa = new Task(1, "Estudar Java", "estudo");
```

---

### 📂 `service`

Responsável pela **lógica de negócio da aplicação**.

Gerencia as tarefas utilizando um **ArrayList**.

Principais métodos:

* `adicionarTarefa()`
* `listarTarefas()`
* `buscarPorId()`
* `concluirTarefa()`
* `removerTarefa()`
* `listarPorTag()`
* `mostrarTarefas()`

---

# ⚙️ Funcionamento do Sistema

Ao executar o programa, o usuário visualiza o menu:

```
1 - Adicionar tarefa
2 - Listar tarefas
3 - Concluir tarefa
4 - Remover tarefa
5 - Filtrar por tag
6 - Sair
```

Exemplo de uso:

```
Escolha uma opcao:
> 1

Digite o ID da tarefa:
> 1

Digite a descricao da tarefa:
> Estudar Java

Digite a tag da tarefa:
> estudo
```

Listagem de tarefas:

```
Lista de Tarefas:

ID: 1
Descricao: Estudar Java
Concluida: false
Tag: estudo
```

---

# 🧩 Conceitos Utilizados

Este projeto aplica diversos conceitos importantes de **Java e programação**:

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Organização em pacotes
* Estrutura de dados (`ArrayList`)
* Estruturas de repetição (`while`)
* Estruturas condicionais (`switch`)
* Entrada de dados com `Scanner`
* Sobrescrita de métodos (`toString()`)

---

# 🛠 Tecnologias Utilizadas

* **Java**
* **JDK 8+**
* **Terminal / CLI**
* **NetBeans / IntelliJ / Eclipse (opcional)**

---

# ▶ Como Executar o Projeto

1. Clone o repositório

```
git clone https://github.com/seu-usuario/todo-cli-java.git
```

2. Entre na pasta do projeto

```
cd todo-cli-java
```

3. Compile os arquivos

```
javac com/todo/app/Main.java
```

4. Execute o programa

```
java com.todo.app.Main
```

---

# 🚀 Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas no projeto:

* Persistência de dados em **arquivo ou banco de dados**
* Interface gráfica (**JavaFX ou Swing**)
* Atualização de tarefas
* Ordenação por prioridade
* Sistema de **datas e prazos**
* Interface web com **Spring Boot**

---

# 👨‍💻 Autor

Projeto desenvolvido para **prática de programação em Java e construção de portfólio no GitHub**.
