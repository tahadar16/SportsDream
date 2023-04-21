package com.reachmobi.sportsdream.ui

import SetupNavGraph
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.ads.MobileAds
import com.reachmobi.sportsdream.ui.navigation.Screen
import com.reachmobi.sportsdream.ui.theme.SportsDreamTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MobileAds.initialize(this) {}

        setContent {
            SportsDreamTheme {
                val navController = rememberNavController()
                val startDestination = Screen.PlayersList.route
                SetupNavGraph(navController = navController, startDestination = startDestination)
            }

        }
    }
}