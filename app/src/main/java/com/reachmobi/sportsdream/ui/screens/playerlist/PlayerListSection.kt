package com.reachmobi.sportsdream.ui.screens.playerlist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.reachmobi.sportsdream.data.Player

@Composable
fun PlayerListSection(
    playersList: MutableList<Player>,
    navController: NavController
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(playersList) {
            PlayerListItem(player = it, navController)
        }
    }
}
