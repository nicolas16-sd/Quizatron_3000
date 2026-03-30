package com.aulascom.quiz.screen.classPergunta

data class Pergunta(
    val pergunta: String,
    val alternativas: List<String>,
    val respostaCorreta: Int
)
