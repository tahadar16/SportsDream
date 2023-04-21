package com.reachmobi.sportsdream.ui.screens.playerlist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.reachmobi.sportsdream.R
import com.reachmobi.sportsdream.data.Player

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerListItem(player: Player) {
    Card(
        onClick = { /*TODO*/ },
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(player.strThumb)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.placeholder),
                error =  painterResource(R.drawable.placeholder),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.padding(end = 8.dp).clip(CircleShape).size(80.dp)
            )

            Column(Modifier.fillMaxSize()) {

                Text(text = player.strPlayer ?: "", fontWeight = FontWeight.Bold, fontSize = 16.sp, maxLines = 1)
                Text(text = player.strTeam ?: "", fontSize = 14.sp, maxLines = 1)
                Text(text = player.strSport ?: "", fontSize = 14.sp, maxLines = 1)
            }
        }
    }
}