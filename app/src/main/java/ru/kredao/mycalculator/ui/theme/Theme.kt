package ru.kredao.mycalculator.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf



val LocalColorProvider = staticCompositionLocalOf<Colors> {
    error("No default colors provided")
}

object AppTheme {
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColorProvider.current
}

@Composable
fun MyCalculatorTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkPalette
    } else {
        lightPalette
    }


    CompositionLocalProvider(
        LocalColorProvider provides colors,
        content = content
    )
}