package com.project.attandancesystemepics.screens.screenUtils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Home",
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.SemiBold),
            )
        },
//        navigationIcon = {
//            IconButton(onClick = showNavigationDrawer) {
//                Icon(
//                    imageVector = Icons.Default.Menu,
//                    contentDescription = "Menu"
//                )
//            }
//        },
    )
}
