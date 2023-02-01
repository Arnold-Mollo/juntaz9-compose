package com.techeraperu.juntaz9_compose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.techeraperu.juntaz9_compose.R

val Exo2 = FontFamily(
    Font(R.font.exo2_regular),
    Font(R.font.exo2_bold, FontWeight.Bold)
)

//@ExperimentalUnitApi
val JuntaZ9Typography = Typography(
    h1 = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        //letterSpacing = TextUnit(0.15f, TextUnitType.Sp)
    ),
    button = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        //letterSpacing = TextUnit(1.25f, TextUnitType.Sp)
    ),
    caption = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = Color(0xFF3A0A5E)
    ),
    subtitle1 = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    body2 = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)