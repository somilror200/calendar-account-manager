package `fun`.lifeupapp.calmanager.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = MYPinkPrimaryTextColor,
    primaryVariant = MYPinkSecondaryColor,
    secondary = MYPinkPrimaryTextColor,
    secondaryVariant = Color.White,
    background = MYPinkBackground,
    onBackground = black2,
    surface = Color.White
)

private val LightColorPalette = lightColors(
    primary = MYPinkPrimaryTextColor,
    primaryVariant = MYPinkSecondaryColor,
    secondary = MYPinkPrimaryTextColor,
    background = MYPinkBackground,
    onBackground = black2

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CalendarManagerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
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