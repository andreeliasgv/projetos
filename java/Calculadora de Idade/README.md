# Calcular Idade (Java)

> Programa simples em Java para calcular a idade em anos, meses e dias a partir do ano de nascimento e do ano do último aniversário.

---

## 💡 Proposta
Este projeto tem o objetivo de consolidar conceitos básicos de Java — leitura de entrada, operações aritméticas e estruturas condicionais — através de um programa console que calcula a idade do usuário em anos, meses e dias.

O programa pede:
- o **ano de nascimento**, e
- o **ano do último aniversário**,

e imprime a idade em **anos**, **meses** (anos × 12) e **dias** (anos × 365), além de informar se o usuário é **maior ou menor de idade**.

---

## ✅ Recursos usados (Java)
- `Scanner` — leitura de dados do usuário (entrada padrão).
- Tipos primitivos (`double`) — armazenagem e cálculos (anos, meses, dias).
- Operadores aritméticos (`-`, `*`) — cálculos de idade.
- Estrutura condicional (`if/else`) — verificação de maioridade.
- `scanner.close()` — fechamento do recurso `Scanner`.

---

## 📁 Estrutura do projeto
```
/calcular-idade-java
  ├─ src/
  │   └─ Calcular_idade.java   // arquivo principal com a implementação
  └─ README.md
```

> Observação: Recomenda-se renomear a classe para `CalcularIdade` (convenção CamelCase) e o arquivo para `CalcularIdade.java`.

---

## ▶️ Como compilar e executar
Navegue até a pasta que contém `Calcular_idade.java` e execute:

```bash
# se Calcular_idade.java estiver na raiz do repositório
javac Calcular_idade.java
java Calcular_idade

# se estiver em src/
javac src/Calcular_idade.java
java -cp src Calcular_idade
```

> Se renomear a classe para `CalcularIdade`, atualize os comandos para `CalcularIdade.java` / `CalcularIdade`.

---

## 🖥️ Exemplo de execução (exemplo de saída no console)
```
Informe o ano do seu nascimento: 
1995
Informe o ano do seu último aniversário: 
2024
Sua idade é: 
29.0 anos ou
348.0 meses ou
10585.0 dias.
Você é maior de idade.
```

> Observação: o programa usa `double` e imprime valores como `29.0`. Para exibir inteiros, pode-se usar `int` quando apropriado.

---

## 🔧 Observações e melhorias sugeridas
- **Validação de entrada**: validar que os anos são números inteiros e que `aniversario >= nascimento`. Tratar `InputMismatchException`.
- **Usar `int` para anos**: anos são inteiros; usar `int` evita decimais desnecessários.
- **Cálculo preciso de dias**: usar `java.time.LocalDate` e `Period` para calcular idade exata em anos, meses e dias, considerando anos bissextos e datas completas (dia/mês/ano).
- **Melhor nome de classe**: seguir convenção Java e renomear para `CalcularIdade`.
- **Internacionalização e mensagens**: deixar mensagens centralizadas e fáceis de traduzir.
- **Tests unitários**: criar testes automatizados (JUnit) para verificar cálculos em diferentes cenários.
- **Interface**: adicionar menu, opção para repetir cálculo, ou interface gráfica simples (Swing/JavaFX).

---

## Contribuição
Pull requests e sugestões são bem-vindas. Para pequenas correções e melhorias, proponha PRs com descrições claras.

Sugestão de mensagem de commit: `feat: adicionar calculadora de idade em Java (console)`

---

## Licença
Este projeto pode ser licenciado sob **MIT License** — adicione um arquivo `LICENSE` se desejar.

---

Se quiser, eu posso:
- gerar uma versão refatorada do `Calcular_idade.java` usando `LocalDate` e `Period` para cálculo exato;
- renomear a classe para `CalcularIdade` e atualizar o README e comandos de compilação automaticamente;
- criar `LICENSE` e `.gitignore` prontos para o repositório.
