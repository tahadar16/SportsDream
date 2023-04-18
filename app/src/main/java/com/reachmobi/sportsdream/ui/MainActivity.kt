package com.reachmobi.sportsdream.ui

import SetupNavGraph
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.reachmobi.sportsdream.R
import com.reachmobi.sportsdream.ui.navigation.Screen
import com.reachmobi.sportsdream.ui.theme.SportsDreamTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        setContent {
            SportsDreamTheme {
                val navController = rememberNavController()
                val startDestination = Screen.PlayersList.route
                SetupNavGraph(navController = navController, startDestination = startDestination)
            }
        }
    }
}