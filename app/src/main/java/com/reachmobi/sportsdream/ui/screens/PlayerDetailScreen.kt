package com.reachmobi.sportsdream.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.reachmobi.sportsdream.data.Player

@Composable
fun PlayerDetailScreen(player: Player) {

    Surface {
        Column(Modifier.fillMaxSize()) {
            Text(
                text = player.strPlayer ?: "",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                maxLines = 1
            )
        }
    }
}