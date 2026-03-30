package com.aulascom.quiz.screen.quizScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.aulascom.quiz.R
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

@Composable
fun QuizScreen(navController: NavController) {
    val viewModel: QuizViewModel = viewModel()
    val pergunta = viewModel.perguntaAtual
    var respondeu by remember { mutableStateOf(false) }
    var selecionado by remember { mutableStateOf(-1) }

    if (viewModel.acabou){
        navController.navigate(
            "result/${viewModel.pontuacao}"
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(255, 118, 245, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .padding(top = 40.dp)
        ) {
            Image(
                modifier = Modifier.size(60.dp),
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Icon Quiz"
            )
        }

        Spacer(modifier = Modifier.padding(12.dp))

        OutlinedButton(
            onClick = { },
            modifier = Modifier
                .width(285.dp)
                .height(55.dp),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color(77, 203, 75, 195)
            )
        ) {
            Text(
                text = "Pergunta ${viewModel.indexPergunta + 1} de 3",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.padding(24.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(400.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = pergunta.pergunta
                    )

                    pergunta.alternativas.forEachIndexed { index, alternativa ->
                        OutlinedButton(
                            onClick = {
                                    viewModel.responder(index)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp)
                                .height(66.dp),
                            shape = RoundedCornerShape(8.dp),
                            border = BorderStroke(1.dp, Color(189, 189, 189, 255)),
                            colors = ButtonDefaults.outlinedButtonColors(
                                containerColor = Color.White
                            )
                        ) {
                            Text(
                                text = alternativa,
                                fontSize = 18.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                }
            }
        }
    }
}