package com.reachmobi.sportsdream.ui.screens.playerlist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.reachmobi.sportsdream.data.Player

@Composable
fun PlayerListSection(
    playersList: MutableList<Player>
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(playersList) {
            Text(text = it.strPlayer ?: "")
        }
    }
}
