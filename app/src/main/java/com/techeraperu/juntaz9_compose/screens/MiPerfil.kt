package com.techeraperu.juntaz9_compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.techeraperu.juntaz9_compose.R
import com.techeraperu.juntaz9_compose.components.MyTextField

@Composable
fun MiPerfil(navController: NavHostController, isHome: (Boolean) -> Unit) {
    isHome(false)
    Box(
        modifier = Modifier
            .padding(start = 22.dp, top = 10.dp, end = 22.dp, 40.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            MiPerfilHead()
            Spacer(modifier = Modifier.height(20.dp))
            MiPerfilForm()
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(174.525.dp),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(text = "Actualizar")
                }
            }
        }

    }
}

@Composable
fun MiPerfilHead(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(89.5.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Mi Perfil",
                style = MaterialTheme.typography.h1,
            )
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(106.25.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(89.5.dp)
                                .height(89.5.dp),
                            shape = RoundedCornerShape(45.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = MaterialTheme.colors.onSecondary
                            ),
                            contentPadding = PaddingValues(0.dp)
                        ) {

                        }
                    }
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(22.375.dp)
                                .height(22.375.dp),
                            shape = RoundedCornerShape(45.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = MaterialTheme.colors.primary
                            ),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = R.drawable.cambiar_imagen_usuario),
                                contentDescription = "Cambiar imagen",
                                tint = MaterialTheme.colors.background
                            )
                        }
                    }
                }

            }

        }
    }
}

@Composable
fun MiPerfilForm() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.85f)
    ) {
        Column {
            MyTextField(placeholder = "Nombres")
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "Apellidos")
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "Fecha de nacimiento")
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "Correo electrónico", teclado = KeyboardType.Email)
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "Celular", teclado = KeyboardType.Phone)
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "País")
            Spacer(modifier = Modifier.height(3.dp))
            MyTextField(placeholder = "Ciudad")
        }
    }
}