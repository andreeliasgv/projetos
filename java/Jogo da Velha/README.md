# Jogo da Velha (Java)

> Pequeno jogo da velha (tic-tac-toe) para console, desenvolvido para treinar fundamentos de Java: arrays 2D, laços, condicionais, entrada do usuário e geração de números aleatórios.

---

## 💡 Proposta
Este projeto implementa um jogo da velha simples em Java onde o jogador humano joga contra o computador (PC). O objetivo é praticar lógica de programação e estruturas básicas da linguagem com foco em legibilidade e clareza.

O tabuleiro é representado por uma matriz `char[3][3]` e espaços vazios são indicados por `'-'`.

---

## ✅ Recursos usados (Java)
- `Scanner` — leitura de entrada do usuário (linha/coluna e escolha X/O).
- `Random` — jogadas do PC (escolha aleatória de células livres).
- Arrays bidimensionais (`char[][]`) — representação do tabuleiro.
- Estruturas de repetição (`while`, `for`) — fluxo de jogo e desenho do tabuleiro.
- Estruturas condicionais (`if`) — verificação de vitória, empate e validade de jogada.
- `Character.toUpperCase()` — normalização da entrada do usuário.

---

## 📁 Estrutura do projeto
```
/jogo-da-velha-java
  ├─ src/
  │   └─ Main.java   // arquivo principal com a implementação do jogo
  └─ README.md
```

> Observação: o código fornecido assume que o arquivo principal chama-se `Main.java` e está na pasta `src` ou na raiz do projeto — ajuste os comandos abaixo conforme sua organização.

---

## ▶️ Como compilar e executar
Navegue até a pasta que contém `Main.java` e execute:

```bash
# se Main.java estiver na raiz do repositório
javac Main.java
java Main

# se estiver em src/
javac src/Main.java
java -cp src Main
```

---

## 🖥️ Exemplo de execução (exemplo de saída no console)
```
=====JOGO DA VELHA=====

Você quer jogar como X ou O?
X
Opção escolhida: X
Seu adversário (PC): O

- - -
- - -
- - -

Informe a linha que deseja jogar: (0 a 2)
1
Informe a coluna que deseja jogar: (0 a 2)
1
- - -
- X -
- - -

O PC jogou na linha 0 e coluna 2
- - O
- X -
- - -

Informe a linha que deseja jogar: (0 a 2)
0
Informe a coluna que deseja jogar: (0 a 2)
0
X - O
- X -
- - -

Parabéns, você ganhou!

Resultado Final:
X - O
- X -
- - -
```

(O fluxo real varia conforme as escolhas do jogador e as jogadas aleatórias do PC.)

---

## 🔧 Melhorias sugeridas (próximos passos)
- Implementar inteligência simples (bloquear vitória do jogador / buscar vitória do PC).
- Validar entradas com tratamento de exceções (`InputMismatchException`) para evitar erros se o usuário digitar valores fora do intervalo.
- Adicionar menu para reiniciar o jogo, escolher nível do PC e estatísticas (vitórias/derrotas/empates).
- Refatorar a lógica de verificação de vitória em métodos separados para legibilidade e testes.
- Implementar versão com interface gráfica (Swing/JavaFX) ou versão web (JavaScript/Python) futuramente.

---

## Contribuição
Pull requests e sugestões são bem-vindas. Sinta-se à vontade para:
- Abrir issues descrevendo bugs ou melhorias.
- Enviar PRs com pequenas correções, refatorações ou novos recursos.

Sugestão de mensagem de commit: `feat: adicionar jogo da velha em Java (console)`

---

## Licença
Este projeto está licenciado sob a **MIT License** — verifique o `LICENSE` na raiz do repositório.

---

Se quiser, eu posso também:
- gerar uma versão refatorada de `Main.java` com funções separadas e tratamento de exceções;
- criar um `LICENSE` MIT pronto;
- adicionar badges ou GIF demonstrativo ao README.
