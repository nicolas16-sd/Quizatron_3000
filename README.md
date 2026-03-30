# 🎯 Quizatron 3000

Um aplicativo de quiz desenvolvido em **Kotlin + Jetpack Compose**, utilizando arquitetura **MVVM**, com navegação entre telas e sistema de pontuação.

---

## 📱 Preview

> App de perguntas e respostas com feedback visual e tela final de resultado.

---

## 🚀 Funcionalidades

* ✅ Perguntas dinâmicas (não fixas na tela)
* ✅ Alternativas geradas automaticamente
* ✅ Feedback visual:

    * 🟢 Verde → resposta correta
    * 🔴 Vermelho → resposta errada
* ✅ Controle de progresso (Pergunta X de Y)
* ✅ Sistema de pontuação
* ✅ Navegação entre telas (Quiz → Resultado)
* ✅ Reinício do quiz

---

## 🧠 Arquitetura

O projeto segue o padrão **MVVM (Model - View - ViewModel)**:

* **Model** → `Pergunta`
* **ViewModel** → `QuizViewModel`
* **View (UI)** → `QuizScreen` e `ResultScreen`

---

## 🧩 Estrutura do Projeto

```
📦 com.aulascom.quiz
 ┣ 📂 screen
 ┃ ┣ 📂 quizScreen
 ┃ ┃ ┣ QuizScreen.kt
 ┃ ┃ ┗ QuizViewModel.kt
 ┃ ┣ 📂 resultScreen
 ┃ ┃ ┗ ResultScreen.kt
 ┃ ┗ 📂 classPergunta
 ┃   ┗ Pergunta.kt
```

---

## ⚙️ Tecnologias Utilizadas

* Kotlin
* Jetpack Compose
* Navigation Compose
* ViewModel
* State Management (mutableStateOf)

---

## 🔄 Fluxo do App

1. Usuário inicia o quiz
2. Responde uma pergunta
3. Recebe feedback visual
4. Avança automaticamente
5. Ao final:

    * Navega para tela de resultado
    * Exibe pontuação

---

## 🧪 Exemplo de Pergunta

```kotlin
Pergunta(
    "Qual a capital da França?",
    listOf("Londres", "Berlim", "Paris", "Madrid"),
    2
)
```

---

## 🏁 Como Rodar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/nicolas16-sd/Quizatron_3000.git
```

2. Abra no Android Studio

3. Execute em um emulador ou dispositivo físico

---

## 📌 Melhorias Futuras

* ⏳ Delay antes de mudar pergunta
* 🎬 Animações de transição
* 🔊 Efeitos sonoros
* 🏆 Sistema de ranking
* 🌐 Integração com API (perguntas dinâmicas)

---

## 👨‍💻 Autor

Desenvolvido por **Nicolas Durão**

---