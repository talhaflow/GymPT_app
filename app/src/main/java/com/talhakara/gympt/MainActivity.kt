package com.talhakara.gympt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.talhakara.gympt.View.LoginScreen
import com.talhakara.gympt.View.anaSayfa
import com.talhakara.gympt.View.kayitOl
import com.talhakara.gympt.ui.theme.GymPtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GymPtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SayfaGecis()
                }
            }
        }
    }
}



@Composable
fun SayfaGecis() {
    var navController = rememberNavController()

    NavHost(navController = navController, startDestination = "loginSayfa") {
        composable("loginSayfa") {
            LoginScreen(navController = navController)
        }
        composable("kayitSayfa") {
            kayitOl(navController = navController)
        }
        composable("anaSayfa") { // Değiştirdim: Aynı hedef ismi kullanılamaz
            anaSayfa(navController = navController)
        }


    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GymPtTheme {

    }
}