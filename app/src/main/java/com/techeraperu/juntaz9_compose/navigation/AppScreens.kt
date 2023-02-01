package com.techeraperu.juntaz9_compose.navigation

sealed class AppScreens(
    val route: String,
) {
    object HomeScreen: AppScreens("home_screen")
    object MiPerfilScreen: AppScreens("mi_perfil_screen")
    object CuentasListScreen: AppScreens("cuentas_list_screen")
    object NuevaCuentaScreen: AppScreens("nueva_cuenta_screen")
}