package com.techeraperu.juntaz9_compose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.ExperimentalUnitApi

private val LightColors = lightColors(
    primary = Purple900,
    primaryVariant = Purple400,
    secondary = Black,
    secondaryVariant = Gray900,
    background = White,
    surface = Gray300,
    onSecondary = Gray700,
)

//@ExperimentalUnitApi
@Composable
fun JuntaZ9Theme(
    content: @Composable () -> Unit
){
    MaterialTheme(
        content = content,
        colors = LightColors,
        typography = JuntaZ9Typography,
    )
}

