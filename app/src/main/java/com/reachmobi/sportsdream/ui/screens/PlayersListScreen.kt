package com.reachmobi.sportsdream.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.reachmobi.sportsdream.R
import com.reachmobi.sportsdream.data.Player
import com.reachmobi.sportsdream.ui.theme.Pink400
import com.reachmobi.sportsdream.viewmodel.PlayerViewModel
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayersListScreen(navController: NavHostController) {
    var searchText by remember { mutableStateOf("") }
    val viewModel : PlayerViewModel = hiltViewModel()
//    var playersList : List<Player> by remember { mutableStateOf(listOf("Messi", "Neymar", "Mappe")) }
    var playersList  by remember { mutableStateOf(listOf("Messi", "Neymar", "Mappe")) }

    Surface {
        Column(Modifier.fillMaxSize()) {
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
                TextButton(onClick = { /*TODO*/ }) {
                    Text(fontSize = 16.sp, text = stringResource(id = R.string.search))
                }
            }

            LazyColumn(Modifier.fillMaxWidth() ) {
                playersList?.let {
                    if (it.isNotEmpty()) {
                        items(it) { player ->
                            Text(player)
                        }
                    }
                }
            }
        }
    }
}
