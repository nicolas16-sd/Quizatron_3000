package com.aulascom.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aulascom.quiz.screen.HomeScreen
import com.aulascom.quiz.screen.QuizScreen
import com.aulascom.quiz.ui.theme.QuizTheme
import androidx.navigation.compose.rememberNavController
import com.aulascom.quiz.screen.ResultScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ){
                        composable("home"){HomeScreen(navController)}
                        composable("quiz"){QuizScreen(navController)}
                        composable("result"){ ResultScreen(navController) }
                    }
                }
            }
        }
    }
}