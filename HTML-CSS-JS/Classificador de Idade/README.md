# 👶 Classificador de Idade em HTML, CSS e JavaScript

Este projeto cria uma **calculadora simples de classificação etária**, que define a categoria da pessoa com base na idade informada.

---

## 🌟 Funcionalidades

1. **Entrada de idade**

   * O usuário digita a idade em um campo numérico.

2. **Classificação automática**

   * Infantil: 0 a 12 anos
   * Adolescente: 13 a 17 anos
   * Adulto: 18 a 59 anos
   * Idoso: 60 anos ou mais

3. **Validação de entrada**

   * Idade não pode ser negativa ou não numérica.

4. **Resultado colorido**

   * Infantil → ciano
   * Adolescente → azul
   * Adulto → preto
   * Idoso → marrom
   * Erro → vermelho

---

## ⚙️ Estrutura do Código

### HTML

* Input numérico para a idade
* Botão para acionar a classificação
* Parágrafo `<p>` para exibir a categoria

### CSS

* Layout centralizado com **flexbox**
* Caixa de input com bordas arredondadas
* Botão estilizado com efeito hover
* Resultados com cores diferentes de acordo com a categoria

### JavaScript

* Função `classificarIdade()`:

  * Lê o valor do input
  * Valida a idade
  * Determina a categoria
  * Exibe o resultado no parágrafo com a cor correspondente

---

## ▶️ Como Usar

1. Abra o arquivo `.html` no navegador.
2. Digite a idade no campo indicado.
3. Clique em **Classificar Idade**.
4. Confira a categoria na tela.

---

## 🖥️ Exemplo de Uso

### Entrada:

```text
Idade: 15
```

### Saída:

```text
Adolescente
```

---
