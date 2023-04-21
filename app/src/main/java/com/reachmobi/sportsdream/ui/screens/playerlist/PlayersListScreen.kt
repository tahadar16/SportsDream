package com.reachmobi.sportsdream.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.reachmobi.sportsdream.R
import com.reachmobi.sportsdream.data.Player
import com.reachmobi.sportsdream.ui.screens.playerlist.PlayerListSection
import com.reachmobi.sportsdream.ui.theme.Pink400
import com.reachmobi.sportsdream.ui.theme.White
import com.reachmobi.sportsdream.viewmodel.PlayerViewModel
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayersListScreen(navController: NavHostController) {
    var searchText by remember { mutableStateOf("") }
    val viewModel : PlayerViewModel = hiltViewModel()
    val playerListState = viewModel.playerListState.value

    Surface {
        Column(Modifier.fillMaxSize().background(color = Color.White)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(.75f)
                        .padding(0.dp),
                    shape = RoundedCornerShape(25.dp),
                    singleLine = true,
                    value = searchText,
                    onValueChange = {
                        searchText = it
                    },
                    placeholder = { Text(stringResource(id = R.string.search) + "...") },
                    leadingIcon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    },
                    trailingIcon = {
                        if (searchText != "") {
                            IconButton(
                                onClick = {
                                    searchText =
                                        "" // Remove text from TextField when you press the 'X' icon
                                }
                            ) {
                                Icon(
                                    Icons.Default.Close,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(20.dp)
                                )
                            }
                        }
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = MaterialTheme.colorScheme.primary,
                        containerColor = Color.Transparent,
                        focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                    )
                )
                TextButton(onClick = { viewModel.searchPlayers(searchText) }) {
                    Text(fontSize = 16.sp, text = stringResource(id = R.string.search))
                }
            }
            playerListState.data?.let { playersList->
                if (playersList.isNotEmpty()) {
                    PlayerListSection(playersList = playersList, navController)
                } else {
                    Text(
                        text = stringResource(id = R.string.no_players_found),
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
            // if there is an error loading the data
            if (playerListState.hasError) {
                Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
                    Text(
                        text = playerListState.errorMsg ?: stringResource(id = R.string.something_went_wrong),
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }

            if (playerListState.isLoading) {
                Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(
                        color = Color.DarkGray,
                    )
                }
            }
        }
    }
}
