package com.techeraperu.juntaz9_compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun NuevaCuenta(navController: NavHostController, isHome: (Boolean) -> Unit) {
    isHome(false)

    Box(
        modifier = Modifier
            .padding(horizontal = 22.dp, vertical = 40.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Nueva Cuenta",
                style = MaterialTheme.typography.h1
            )
            Spacer(modifier = Modifier.height(32.dp))
            NuevaCuentaForm()
        }
    }
}

@Composable
fun NuevaCuentaForm() {
    Text(text = "formulario")
}