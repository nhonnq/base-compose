package dev.nhonnq.app.base

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import dev.nhonnq.app.ui.theme.BasecomposeTheme

@Composable
fun BaseComposeApp(
    isInternetAvailable: Boolean,
    navController: NavHostController? = null,
    content: @Composable (PaddingValues) -> Unit
) {
    BasecomposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                //topBar = { ToolBar(title = "", isInternetAvailable = isInternetAvailable) },
                bottomBar = {
                    if (navController != null) {
                        //BottomNavigationBar(navController)
                    }
                },
                content = content
            )
        }
    }
}

