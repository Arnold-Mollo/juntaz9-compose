package com.techeraperu.juntaz9_compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.techeraperu.juntaz9_compose.R
import com.techeraperu.juntaz9_compose.components.ShadowButton
import com.techeraperu.juntaz9_compose.navigation.AppScreens

@Composable
fun Home(navController: NavHostController, isHome: (Boolean) -> Unit) {
    isHome(true)
    Box(
        modifier = Modifier
            .padding(horizontal = 22.dp, vertical = 60.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            BloqueMiPerfil(navController = navController)
            Spacer(modifier = Modifier.height(42.96.dp))
            BloqueHerramientas(navController = navController)
        }
    }
}

@Composable
fun BloqueMiPerfil(navController: NavHostController) {
    Text(
        text = "Mi Perfil",
        style = MaterialTheme.typography.h1
    )
    Spacer(modifier = Modifier.height(22.375.dp))
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.462f)
                .height(69.81.dp)
        ) {
            ShadowButton(
                icon = ImageVector.vectorResource(id = R.drawable.menu_editar_perfil),
                text = "Editar perfil",
                //onclick = navController.navigate(AppScreens.MiPerfilScreen.route)
            ){navController.navigate(AppScreens.MiPerfilScreen.route)}
        }
        Spacer(modifier = Modifier.fillMaxWidth(0.14126f))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(69.81.dp)
        ) {
            ShadowButton(
                icon = ImageVector.vectorResource(id = R.drawable.menu_cuentas_bancarias),
                text = "Cuentas bancarias",
                //onclick = navController.navigate(AppScreens.CuentasListScreen.route)
            ) {navController.navigate(AppScreens.CuentasListScreen.route)}
        }
    }
}

@Composable
fun BloqueHerramientas(navController: NavHostController) {
    Text(
        text = "Herramientas",
        style = MaterialTheme.typography.h1
    )
    Spacer(modifier = Modifier.height(22.375.dp))
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.462f)
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_grupos),
                    text = "Grupos",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.14126f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_juntas),
                    text = "Juntas",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.462f)
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_sorteo),
                    text = "Sorteo",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.14126f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_pagar_junta),
                    text = "Pagar junta",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.462f)
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_aprobar_pagos),
                    text = "Aprobar pagos",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.14126f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_entregar_junta),
                    text = "Entregar junta",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.462f)
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_validar_entrega),
                    text = "Validar entrega",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.14126f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(69.81.dp)
            ) {
                ShadowButton(
                    icon = ImageVector.vectorResource(id = R.drawable.menu_cerrar_junta),
                    text = "Cerrar junta",
                    //onclick = navController.navigate(AppScreens.HomeScreen.route)
                ) {null}
            }
        }
    }

}

