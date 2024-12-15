package com.project.attandancesystemepics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.project.attandancesystemepics.screens.DashboardScreen
import com.project.attandancesystemepics.ui.theme.AttandanceSystemEPICSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttandanceSystemEPICSTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { LoginScreen(navController) }
                    composable("dashboard") { DashboardScreen(navController) }
                }
            }
        }
    }
}

@Composable
fun LoginScreen(navController: NavController) {
    // Simple Login Screen UI with a button
    androidx.compose.foundation.layout.Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Login Screen", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)

        Button(
            onClick = { navController.navigate("dashboard") }, // Navigate to DashboardScreen
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Temporary Login")
        }
    }
}