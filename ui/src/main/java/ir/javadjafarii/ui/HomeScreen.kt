package ir.javadjafarii.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController,
    scaffoldState: ScaffoldState
) {

    Scaffold(scaffoldState = scaffoldState) { padding ->
        Box(
            Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            Text(
                //   modifier = Modifier.align(Alignment.Center),
                text = "Hi from HomeScreen",
            )
        }
    }

}