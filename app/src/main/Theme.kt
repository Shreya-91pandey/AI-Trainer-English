package com.aitrainer.english.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PurplePrimary,
    onPrimary = TextLight,
    primaryContainer = PurplePrimaryLight,
    onPrimaryContainer = TextDark,

    secondary = PinkSecondary,
    onSecondary = TextLight,
    secondaryContainer = PinkSecondaryLight,
    onSecondaryContainer = TextDark,

    tertiary = AccentPurplePink,
    onTertiary = TextDark,

    background = CreamBackground,
    onBackground = TextDark,

    surface = CreamSurface,
    onSurface = TextDark,
    surfaceVariant = CreamCard,
    onSurfaceVariant = TextMuted,

    error = ErrorRed,
    onError = TextLight
)

private val DarkColorScheme = darkColorScheme(
    primary = PurplePrimaryLight,
    onPrimary = TextDark,
    primaryContainer = PurplePrimaryDark,
    onPrimaryContainer = TextLight,

    secondary = PinkSecondaryLight,
    onSecondary = TextDark,
    secondaryContainer = PinkSecondaryDark,
    onSecondaryContainer = TextLight,

    tertiary = AccentPurplePink,
    onTertiary = TextDark,

    background = Color(0xFF1A1A1A),
    onBackground = TextLight,

    surface = Color(0xFF2D2D2D),
    onSurface = TextLight,
    surfaceVariant = Color(0xFF3D3D3D),
    onSurfaceVariant = Color(0xFFD1D5DB),

    error = ErrorRed,
    onError = TextLight
)

@Composable
fun AITrainerEnglishTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
