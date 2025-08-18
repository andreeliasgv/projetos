# Portfólio — André Vila

> Portfólio pessoal simples em HTML e CSS, projeto desenvolvido como trabalho da disciplina *Design de Interfaces I* e para apresentar minhas habilidades, interesses e projetos.

---

## 📌 Sobre o projeto
Este repositório contém uma página de portfólio estática construída com HTML e CSS puros. A página apresenta uma breve biografia, habilidades, interesses, projetos, metas e um formulário de contato (estático). O design segue um tema escuro simples e responsivo para visualização em desktop.

**Objetivos:**
- Apresentar informações pessoais e profissionais de forma limpa.
- Ter um projeto web simples e direto para exibir no GitHub Pages.
- Praticar marcação HTML sem frameworks e estilização CSS básica.

---

## 🧭 Recursos / Tecnologias usadas
- **HTML5** — estrutura semântica da página.
- **CSS3 (embedded)** — estilização direta no `<head>` (pode ser extraída para um arquivo `styles.css`).
- Recursos simples: formulário (estático), tabela de proficiências, navegação por âncoras, links para redes sociais, imagem de perfil e favicon.

---

## 🗂️ Estrutura sugerida do repositório
```
/portfolio-andre-vila
  ├─ index.html          # arquivo HTML (o projeto que você forneceu)
  ├─ favicon.png         # ícone (opcional)
  ├─ Selfie.jpeg         # imagem de perfil (opcional)
  ├─ styles.css          # (opcional) mover o CSS embutido para arquivo separado
  └─ README.md           # este arquivo
```

> Observação: no seu HTML o CSS está embutido — é ok para projetos pequenos, mas recomendo extrair para `styles.css` em projetos maiores.

---

## ▶️ Como visualizar localmente
Basta abrir o arquivo `index.html` no navegador:
1. Na pasta do projeto, dê duplo-clique no `index.html` — o navegador abrirá a página.  
2. Ou, na linha de comando (recomendado se quiser servir localmente):
```bash
# com Python 3 (servidor simples)
python -m http.server 8000
# depois abra http://localhost:8000 no navegador
```

Se usar VS Code, instale a extensão **Live Server** e clique em *Go Live* para visualizar com recarregamento automático.

---

## 🚀 Deploy (GitHub Pages)
Para publicar o portfólio no GitHub Pages:
1. Crie um repositório no GitHub (ex.: `portfolio-andre-vila`) e envie os arquivos (`index.html`, imagens, `README.md`).
2. Vá em **Settings > Pages** do repositório e configure:
   - Source: `main` branch
   - Folder: `/ (root)`
3. Aguarde e acesse `https://<seu-usuario>.github.io/<nome-do-repositorio>/` (ou se usou repo com nome `<seu-usuario>.github.io`, ficará em `https://<seu-usuario>.github.io`).

---

## 💡 Personalizações recomendadas
Algumas ideias fáceis para melhorar o portfólio:
- Mover o CSS embutido para `styles.css` e adicionar organização por componentes.
- Tornar o layout responsivo (media queries) para celulares.
- Adicionar links diretos para repositórios dos seus projetos (GitHub).
- Substituir o formulário estático por um formulário funcional (ex.: Formspree, Netlify Forms, ou backend simples).
- Incluir favicon e imagens otimizadas (WebP).
- Adicionar badge de contato/LinkedIn/GitHub no topo.

---

## ✅ Boas práticas para o repositório
- Inclua `LICENSE` (sugestão: MIT).
- Adicione `gitignore` (para projetos web muitas vezes não é necessário, mas pode incluir `.DS_Store`).
- Mantenha o `README.md` bilíngue (PT/EN) para alcance internacional.
- Adicione um `screenshot.png` ou GIF demonstrando a página (mostra visual sem precisar abrir).

---

## 🛠️ Melhorias futuras (próximos passos)
- Responsividade completa e testes em dispositivos móveis.
- Versão multi-idioma (pt/en) com alternador de idioma.
- Adicionar animações sutis (transições CSS) e modo claro/escuro com toggle.
- Migrar para um gerador de sites estáticos (ex.: Jekyll, Eleventy) quando quiser templates e páginas dinâmicas.
- Adicionar analytics simples (sem quebrar privacidade).

---

## ✉️ Contato
- **E-mail:** andrevila2016@hotmail.com  
- **Facebook:** https://www.facebook.com/andre.eliasguimaraesvila/  
- **Instagram:** https://www.instagram.com/andreeliasgv

---

## Licença
Este projeto pode ser distribuído sob a **MIT License** — adicione um arquivo `LICENSE` na raiz do repositório, se desejar.

---

> Se quiser, eu gero agora:
> - o arquivo `styles.css` com o CSS extraído,
> - um `screenshot.png` (instruções para capturar) e
> - o arquivo `LICENSE` (MIT) pronto para adicionar ao repositório.
