package com.example.kopi_senja.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = SunsetOrangeDark,
    onPrimary = OnSunsetOrangeDark,
    primaryContainer = PrimaryContainerDark,
    secondary = EarthyBrownDark,
    tertiary = GoldenHourLight,
    background = SunsetBlackDark,
    surface = SunsetBlackDark,
    onBackground = CreamDark,
    onSurface = CreamDark,
    surfaceContainer = SurfaceContainerDark
)

private val LightColorScheme = lightColorScheme(
    primary = SunsetOrangeLight,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    primaryContainer = PrimaryContainerLight,
    secondary = EarthyBrownLight,
    tertiary = GoldenHourLight,
    background = CreamLight,
    surface = CreamLight,
    onBackground = OnCreamLight,
    onSurface = OnCreamLight,
    surfaceContainer = CreamContainerLight,
    outline = OutlineLight
)

@Composable
fun Kopi_SenjaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
