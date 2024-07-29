package ru.kredao.mycalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import ru.kredao.mycalculator.ui.theme.AppTheme
import ru.kredao.mycalculator.ui.theme.MyCalculatorTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ru.kredao.mycalculator.ui.screens.mainScreen.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                val systemUiController = rememberSystemUiController()

                val primaryBackground = AppTheme.colors.primaryBackground
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = primaryBackground,
                        darkIcons = true
                    )
                }
                MainScreen()
            }
        }
    }
}