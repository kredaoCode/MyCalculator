package ru.kredao.mycalculator.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primaryBackground: Color,
    val secondaryBackground: Color,
    val primaryText: Color,
    val secondaryText: Color,
)

val lightPalette = Colors(
    primaryBackground = Color(0xFFD5D9FB),
    secondaryBackground = Color(0xFFBEBEE2),
    primaryText = Color(0xFF3F5BEA),
    secondaryText = Color(0x4D3F5BEA),
)

val darkPalette = Colors(
    primaryBackground = Color(0xFF19191E),
    secondaryBackground = Color(0xFF222228),
    primaryText = Color(0xFF3F5BEA),
    secondaryText = Color(0x4D3F5BEA),
)