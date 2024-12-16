package com.project.attandancesystemepics.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun DashboardScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome Back 👋",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Upcoming Classes",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp),
                textAlign = TextAlign.Start
            )

            val upcomingClasses = listOf(
                Triple("MAT3001", "5 Dec", "1.15 - 2.50"),
                Triple("CSE4002", "6 Dec", "10.00 - 11.30"),
                Triple("PHY2004", "7 Dec", "2.00 - 3.30")
            )

            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(upcomingClasses) { classInfo ->
                    ClassCard(
                        className = classInfo.first,
                        date = classInfo.second,
                        time = classInfo.third,
                        onClick = {
                            navController.navigate("PerClassView")
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ClassCard(className: String, date: String, time: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clickable {onClick()},
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF9A74F0)),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = className,
                color = Color.White,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "$date $time",
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
@Composable
fun BottomNavigationBar(navController: NavController) {
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