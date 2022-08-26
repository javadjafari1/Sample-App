package ir.javadjafarii.sampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ir.javadjafarii.sampleapp.ui.theme.SampleAppTheme
import ir.javadjafarii.ui.homeGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            SampleAppTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(MaterialTheme.colors.background)

                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .imePadding()
                        .navigationBarsPadding()
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = "main"
                    ) {
                        homeGraph(navController, scaffoldState)
                    }
                }
            }
        }
    }
}
