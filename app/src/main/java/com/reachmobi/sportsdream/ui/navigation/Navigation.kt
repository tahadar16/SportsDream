

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.reachmobi.sportsdream.ui.navigation.Screen
import com.reachmobi.sportsdream.ui.screens.PlayerDetailScreen
import com.reachmobi.sportsdream.ui.screens.PlayersListScreen
import kotlinx.coroutines.ExperimentalCoroutinesApi

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
            PlayerDetailScreen(navController = navController)
        }
    }
}
