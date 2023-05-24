

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.reachmobi.sportsdream.data.Player
import com.reachmobi.sportsdream.ui.navigation.Screen
import com.reachmobi.sportsdream.ui.screens.PlayerDetailScreen
import com.reachmobi.sportsdream.ui.screens.playerlist.PlayersListScreen

//@ExperimentalCoroutinesApi
//@ExperimentalPermissionsApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.PlayersList.route) {
            PlayersListScreen(navController = navController)
        }
        composable(route = Screen.PlayerDetail.route) {
            val player = navController.currentBackStackEntry?.arguments?.getParcelable<Player>("player")
            PlayerDetailScreen(player = player ?: Player() )
        }
    }
}
