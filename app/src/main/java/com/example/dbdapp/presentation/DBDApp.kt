package com.example.dbdapp.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dbdapp.R
import com.example.dbdapp.navigation.NavigationItem
import com.example.dbdapp.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DBDApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry = navController.currentBackStackEntryAsState().value
    val currentScreen = navBackStackEntry?.destination?.route
    val showBackButton = navBackStackEntry?.destination?.route != Screen.Home.route

    val title = when (currentScreen) {
        "Home" -> "Dead By Daylight Wiki"
        "Explore" -> "Explore"
        "About" -> "About"
        else -> "Detail Killer"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(title, textAlign = TextAlign.Center)
                },
                navigationIcon = {
                    if (showBackButton) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                }
            )
        },
        modifier = modifier,
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }
            composable(Screen.Explore.route) {
                GridScreen(navController)
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                Screen.Detail.route + "/{killerId}",
                arguments = listOf(navArgument("killerId") {
                    type = NavType.StringType
                })
            ) { navBackStackEntry ->
                DetailScreen(
                    killerId = navBackStackEntry.arguments?.getString("killerId")
                )
            }
        }
    }
}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = "Home",
                icon = painterResource(R.drawable.baseline_home_24),
                screen = Screen.Home
            ),
            NavigationItem(
                title = "Explore",
                icon = painterResource(R.drawable.baseline_grid_view_24),
                screen = Screen.Explore
            ),
            NavigationItem(
                title = "About",
                icon = painterResource(R.drawable.baseline_person_24),
                screen = Screen.About
            ),
        )

        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(painter = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}