package ru.kredao.mycalculator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ru.kredao.mycalculator.R

val MyFontFamily = FontFamily(
    Font(R.font.roboto, FontWeight.Normal)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 48.sp,
        textAlign = TextAlign.Right,
    ),
    displayMedium = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 32.sp,
        textAlign = TextAlign.Center
    ),
    displaySmall = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 24.sp,
        textAlign = TextAlign.Right,
    ),
)