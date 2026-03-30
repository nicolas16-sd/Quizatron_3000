package com.aulascom.quiz.screen.quizScreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aulascom.quiz.screen.classPergunta.Pergunta
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlin.collections.get

class QuizViewModel: ViewModel() {

    private val perguntas = listOf(
        Pergunta("Qual a capital da França?", listOf("Londres", "Berlim", "Paris", "Madrid"), 2),
        Pergunta("Qual o filme com maior bilheteria da história?", listOf("Avatar (2009)", "Vingadores: Ultimato (2019)", "Avatar: O caminho da água (2022)", "Titanic (1997)"), 0),
        Pergunta("Quais foram as batalhas mais importantes da Segunda Guerra Mundial?", listOf("Bulge e Midway", "Pearl Harbor e El Alamein", "Normandia e Stalingrado", "Dunkirk e Iwo Jima"), 2)
    )

    var indexPergunta by mutableStateOf(0)
        private set

    val perguntaAtual: Pergunta
        get() = perguntas[indexPergunta]

    var pontuacao by mutableStateOf(0)
        private set

    var acabou by mutableStateOf(false)
        private set

    fun responder(indiceSelecionado: Int){
        val correta = perguntaAtual.respostaCorreta

        if (indiceSelecionado == correta){
            pontuacao++
        } else {
            //errou
        }

        proximaPergunta()
    }

    private fun proximaPergunta() {
        if (indexPergunta < perguntas.size - 1) {
            indexPergunta++
        } else {
            acabou = true
        }
    }
}


