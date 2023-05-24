package com.reachmobi.sportsdream.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = Pink400,
//    primaryVariant = Pink950,
    onPrimary = Black,
    secondary = Purple400,
//    secondaryVariant = Purple400,
    onSecondary = Black
)

private val LightColorPalette = lightColorScheme(
    primary = Pink600,
//    primaryVariant = Pink950,
    onPrimary = White,
    secondary = Purple400,
//    secondaryVariant = Purple700,
    onSecondary = Black
)

@Composable
fun SportsDreamTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colorScheme = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}