package com.example.dbdapp.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("Home")
    data object Explore: Screen("Explore")
    data object Detail: Screen("Detail")
    data object About: Screen("About")
}