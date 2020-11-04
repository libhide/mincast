package com.madebyratik.mincast

import androidx.compose.foundation.Text
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.navigation.compose.*
import com.madebyratik.mincast.data.episodes
import com.madebyratik.mincast.data.podcasts
import com.madebyratik.mincast.ui.explore.ExploreScreen
import com.madebyratik.mincast.ui.profile.ProfileScreen
import com.madebyratik.mincast.ui.saved.SavedScreen
import com.madebyratik.mincast.ui.search.SearchScreen
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun MinCastApp() {
    val navController = rememberNavController()

    val navItems = listOf(
        Screen.Explore,
        Screen.Saved,
        Screen.Search,
        Screen.Profile
    )

    MinCastTheme {
        Scaffold(
            bottomBar = {
                BottomNavigation {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)

                    navItems.forEach { screen ->
                        BottomNavigationItem(
                            icon = { Icon(vectorResource(screen.iconIdRes)) },
                            label = { Text(stringResource(screen.resourceId)) },
                            selected = currentRoute == screen.route,
                            onClick = {
                                // This is the equivalent to popUpTo the start destination
                                navController.popBackStack(
                                    navController.graph.startDestination,
                                    false
                                )

                                // This if check gives us a "singleTop" behavior where we do not create a
                                // second instance of the composable if we are already on that destination
                                if (currentRoute != screen.route) {
                                    navController.navigate(screen.route)
                                }
                            }
                        )
                    }
                }
            }
        ) {
            NavHost(navController, startDestination = Screen.Explore.route) {
                composable(Screen.Explore.route) {
                    ExploreScreen(
                        navController,
                        podcasts,
                        episodes
                    )
                }
                composable(Screen.Saved.route) { SavedScreen(navController) }
                composable(Screen.Search.route) { SearchScreen(navController) }
                composable(Screen.Profile.route) { ProfileScreen(navController) }
            }
        }
    }
}