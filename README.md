# 🍀 Mega Sena - Gerador de Números da Sorte

Este é um aplicativo Android simples e funcional criado para gerar números aleatórios para apostas na **Mega Sena**, a famosa loteria brasileira. Com um visual limpo e intuitivo, o app oferece uma experiência rápida e divertida para quem quer testar a sorte!

---

## 📱 Funcionalidades

- Geração de **6 números aleatórios** entre 1 e 60
- Garantia de **números únicos** (sem repetições)
- Exibição dos números em **ordem crescente**
- Interface visual com:
  - Título estilizado
  - Imagem de trevo da sorte
  - Texto de resultado
  - Botão para gerar os números

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin**
- **Android Studio**
- **ConstraintLayout**
- `findViewById` para manipulação de componentes
- `mutableListOf<Int>()` para armazenar os números
- `sort()` para ordenação
- `joinToString(" - ")` para exibição formatada

---

## 🎨 Layout

O layout foi cuidadosamente desenhado no modo Design do Android Studio, com todos os elementos centralizados verticalmente na tela usando **Vertical Chain** e constraints bem definidas. O resultado é uma interface responsiva e agradável em diferentes tamanhos de tela.

---

## 🚀 Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/mega-sena-app.git
