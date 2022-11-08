package com.example.aplikasimobile1.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class NavigationApps : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavApps()
        }
    }
}
@Composable
fun NavApps(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "ScreenSatu"){
        composable("ScreenSatu"){
            ScreenSatu(navController)
        }
        composable("ScreenDua"){
            ScreenDua(navController)
        }
    }
}