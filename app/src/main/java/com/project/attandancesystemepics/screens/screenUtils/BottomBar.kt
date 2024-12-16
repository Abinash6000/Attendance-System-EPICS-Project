package com.project.attandancesystemepics.screens.screenUtils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") },
            selected = false,
            onClick = { /* TODO: Add navigation logic */ },
            label = { Text("Home") }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.AccountBox, contentDescription = "All Classes") },
            selected = false,
            onClick = { /* TODO: Add navigation logic */ },
            label = { Text("All Classes") }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Email, contentDescription = "Messages") },
            selected = false,
            onClick = { /* TODO: Add navigation logic */ },
            label = { Text("Messages") }
        )
    }
}