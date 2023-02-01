package com.techeraperu.juntaz9_compose.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.techeraperu.juntaz9_compose.R
import com.techeraperu.juntaz9_compose.navigation.AppNavigation
import com.techeraperu.juntaz9_compose.navigation.AppScreens
import kotlinx.coroutines.CoroutineScope

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyScaffold(){

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var title by rememberSaveable{ mutableStateOf("Rubén Pillaca") }
    var navController = rememberNavController()
    var isHome by remember {mutableStateOf(true)}

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {TopBar(
            scope = scope,
            scaffoldState = scaffoldState,
            title = title,
            navController = navController,
            isHome = isHome
        )},
    ) {
        AppNavigation(
            navController = navController
        ) { isHome = it }
    }


}

@Composable
fun TopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState,
    title: String,
    navController: NavHostController,
    isHome: Boolean
)
{
    TopAppBar(
        title = {
            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.fillMaxSize()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.usuario),
                        contentDescription = "Usuario",
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = title,
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.subtitle1
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(width = 20.dp, height = 20.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.desplegar_blanco),
                            contentDescription = "Desplegar",
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        },

        navigationIcon = {
            if (!isHome){
                IconButton(
                    onClick = {
                        navController.popBackStack()
                        navController.popBackStack()
                        navController.navigate(AppScreens.HomeScreen.route)
                    },

                    ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.menu),
                        contentDescription = "Hamburger menu"
                    )
                }
            }
        }
    )
}