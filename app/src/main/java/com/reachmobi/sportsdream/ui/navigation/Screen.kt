package com.reachmobi.sportsdream.ui.navigation

sealed class Screen(val route: String) {
    object PlayersList : Screen (route = "players_list")
    object PlayerDetail : Screen (route = "player_detail")
}
