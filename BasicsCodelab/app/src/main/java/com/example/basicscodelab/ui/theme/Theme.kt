package com.example.basicscodelab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color



/** My theme */
private val DarkColorPalette = darkColors(
    surface = Blue,
    onSurface = Navy,
    primary = Navy,
    onPrimary = Chartreuse
)
private val LightColorPalette = lightColors(
    surface = Blue,
    onSurface = Color.White,
    primary = LightBlue,
    onPrimary = Navy
)


// private val DarkColorPalette = darkColors(
//     primary = Purple200,
//     primaryVariant = Purple700,
//     secondary = Teal200
// )

// private val LightColorPalette = lightColors(
//     primary = Purple500,
//     primaryVariant = Purple700,
//     secondary = Teal200
//
//     /* Other default colors to override
//     background = Color.White,
//     surface = Color.White,
//     onPrimary = Color.White,
//     onSecondary = Color.Black,
//     onBackground = Color.Black,
//     onSurface = Color.Black,
//     */
// )

/** MaterialTheme */
@Composable
fun BasicsCodelabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}