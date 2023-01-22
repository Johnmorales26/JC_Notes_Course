package com.johndev.jc_notes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = primary_light_color,
    primaryVariant = primary_color,
    secondary = secondary_light_color,
    secondaryVariant = secondary_color,
    onPrimary = primary_text_color,
    onSecondary = secondary_text_color,
    background = background_dark,
    surface = surface_dark,
    onBackground = on_background_dark,
    onSurface = on_surface_dark,
)

private val LightColorPalette = lightColors(
    primary = primary_color,
    primaryVariant = primary_dark_color,
    secondary = secondary_color,
    secondaryVariant = secondary_dark_color,
    onPrimary = primary_text_color,
    onSecondary = secondary_text_color,
    background = background_light,
    surface = surface_light,
    onBackground = on_background_light,
    onSurface = on_surface_light,
)

@Composable
fun JC_NotesTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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