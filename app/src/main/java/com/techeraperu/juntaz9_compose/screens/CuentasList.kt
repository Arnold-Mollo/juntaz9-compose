package com.techeraperu.juntaz9_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.techeraperu.juntaz9_compose.R
import com.techeraperu.juntaz9_compose.data.datos
import com.techeraperu.juntaz9_compose.navigation.AppScreens

@Composable
fun CuentasList(navController: NavHostController, isHome: (Boolean) -> Unit) {
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
                text = "Cuentas Bancarias",
                style = MaterialTheme.typography.h1
            )
            Spacer(modifier = Modifier.height(32.dp))
            TablaCuentas(navController = navController)
        }
    }
}

@Composable
fun TablaCuentas(navController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(0.15f)
                .padding(horizontal = 17.9.dp, vertical = 12.dp)
                //.border(width = 1.dp, color = Color.Black)
        ) {
            Text(
                text = "N°",
                style = MaterialTheme.typography.subtitle2
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.725f)
                .padding(horizontal = 17.9.dp, vertical = 12.dp)
        ) {
            Text(
                text = "N° de Cuenta Bancaria",
                style = MaterialTheme.typography.subtitle2
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(horizontal = 17.9.dp, vertical = 12.dp)
        ) {
            Text(
                text = "Acción",
                style = MaterialTheme.typography.subtitle2
            )
        }

    }
    LazyColumn (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.87f)
    ){
        items(datos.size) { index ->
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(47.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.1366f)
                                .padding(horizontal = 17.9.dp, vertical = 8.dp)
                            //.border(width = 1.dp, color = Color.Black)
                        ) {
                            Text(
                                text = datos[index].numero,
                                style = MaterialTheme.typography.body1
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.725f)
                                .padding(horizontal = 17.9.dp, vertical = 8.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Text(
                                    text = datos[index].cuenta,
                                    style = MaterialTheme.typography.body2
                                )
                                Text(
                                    text = "${datos[index].banco} - ${datos[index].moneda}",
                                    style = MaterialTheme.typography.body1
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(horizontal = 17.9.dp, vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(

                            ) {
                                IconButton(
                                    onClick = { /*TODO*/ },
                                    modifier = Modifier.width(14.dp)
                                ){
                                    Icon(
                                        imageVector = ImageVector.vectorResource(id = R.drawable.editar_morado),
                                        contentDescription = "Editar",
                                        tint = MaterialTheme.colors.primary
                                    )
                                }
                                Spacer(modifier = Modifier.width(4.dp))
                                IconButton(
                                    onClick = { /*TODO*/ },
                                    modifier = Modifier.width(14.dp)
                                ){
                                    Icon(
                                        imageVector = ImageVector.vectorResource(id = R.drawable.eliminar_morado),
                                        contentDescription = "Eliminar",
                                        tint = MaterialTheme.colors.primary
                                    )
                                }
                            }
                        }
                    }
                }
                Divider(
                    color = MaterialTheme.colors.secondary,
                    thickness = 2.dp
                )
            }

        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(
            onClick = {
                      navController.navigate(AppScreens.NuevaCuentaScreen.route)
            },
            modifier = Modifier.width(174.525.dp),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text(text = "Agregar")
        }
    }

}