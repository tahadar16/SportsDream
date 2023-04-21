package com.reachmobi.sportsdream.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.reachmobi.sportsdream.R
import com.reachmobi.sportsdream.data.Player

@Composable
fun PlayerDetailScreen(player: Player) {

    Surface {
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(player.strThumb)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.placeholder),
                error = painterResource(R.drawable.placeholder),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 8.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.25f)
            )
            Row(Modifier.padding(vertical = 5.dp).fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.name),
                    modifier = Modifier.padding(end = 5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1

                )
                Text(
                    text = player.strPlayer ?: "",
                    fontSize = 16.sp,
                    maxLines = 1
                )
            }
            Row(Modifier.padding(vertical = 5.dp).fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.team),
                    modifier = Modifier.padding(end = 5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1
                )
                Text(
                    text = player.strTeam ?: "",
                    fontSize = 16.sp,
                    maxLines = 1
                )
            }
            Row(Modifier.padding(vertical = 5.dp).fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.sports),
                    modifier = Modifier.padding(end = 5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1
                )
                Text(
                    text = player.strSport ?: "",
                    fontSize = 16.sp,
                    maxLines = 1
                )
            }
            Row(Modifier.padding(vertical = 5.dp).fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.nationality),
                    modifier = Modifier.padding(end = 5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1
                )
                Text(
                    text = player.strNationality ?: "",
                    fontSize = 16.sp,
                    maxLines = 1
                )
            }
            Row(Modifier.padding(vertical = 5.dp).fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.description),
                    modifier = Modifier.padding(end = 5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1
                )
                Text(
                    text = player.strDescriptionEN ?: "",
                    fontSize = 16.sp,
                )
            }
        }
    }
}