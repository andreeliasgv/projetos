# 📦 Calculadora de Frete em HTML, CSS e JavaScript

Este projeto é uma **calculadora de frete simples** para lojas virtuais, que determina o valor do frete com base na **região de entrega** e no **valor da compra**.

---

## 🌟 Funcionalidades

1. **Entrada de valor da compra**:

   * O usuário insere o valor da compra em reais.

2. **Seleção de região de entrega**:

   * Norte, Sul ou Sudeste.

3. **Cálculo automático do frete**:

   * Norte: frete grátis para compras acima de R$100; senão, R$20.
   * Sul: frete grátis para compras acima de R$80; senão, R$15.
   * Sudeste: frete grátis para compras acima de R$50; senão, R$10.

4. **Validações de entrada**:

   * Valor da compra não pode ser zero ou negativo.
   * Região deve ser selecionada.

5. **Exibição do resultado**:

   * Valor do frete e total da compra.
   * Mensagem colorida:

     * **Verde** → frete grátis.
     * **Azul** → frete pago.
     * **Vermelho** → erro de entrada.

---

## ⚙️ Estrutura do Código

### HTML

* Estrutura da página com:

  * Título
  * Input numérico para valor da compra
  * Select para região
  * Botão para calcular frete
  * Parágrafo para exibir resultado

### CSS

* Layout centralizado com **flexbox**.
* Caixa de entrada com bordas arredondadas e sombra.
* Botão estilizado com efeito hover.
* Cores diferenciadas para mensagens de resultado.

### JavaScript

* Função `calcularFrete()`:

  * Obtém valores dos inputs.
  * Valida entradas.
  * Calcula frete baseado em regras por região.
  * Atualiza o parágrafo `resultado` com a mensagem correta.

---

## ▶️ Como Usar

1. Abra o arquivo `.html` no navegador.
2. Digite o valor da compra.
3. Escolha a região de entrega.
4. Clique em **Calcular Frete**.
5. Confira o resultado na tela.

---

## 🖥️ Exemplo de Uso

### Entrada:

```text
Valor da Compra: 120
Região: Norte
```

### Saída:

```text
Parabéns! O frete é grátis. Total: R$120,00
```

---

## 💡 Observações

* Esta calculadora é **responsiva** e funciona em dispositivos móveis.
* Fácil de expandir:

  * Adicionar novas regiões.
  * Alterar regras de frete.
  * Aplicar descontos adicionais.

---
