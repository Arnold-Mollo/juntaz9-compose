package com.techeraperu.juntaz9_compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.techeraperu.juntaz9_compose.screens.*

@Composable
fun AppNavigation(
    navController: NavHostController,
    isHome: (Boolean) -> Unit,
) {
    NavHost(
        navController = navController,
        startDestination = AppScreens.HomeScreen.route
    ) {
        composable(AppScreens.HomeScreen.route) {
            Home(navController = navController, isHome = isHome)
        }
        composable(AppScreens.MiPerfilScreen.route) {
            MiPerfil(navController = navController, isHome = isHome)
        }
        composable(AppScreens.CuentasListScreen.route) {
            CuentasList(navController = navController, isHome = isHome)
        }
        composable(AppScreens.NuevaCuentaScreen.route) {
            NuevaCuenta(navController = navController, isHome = isHome)
        }
    }
}