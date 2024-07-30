package ru.kredao.mycalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ru.kredao.mycalculator.ui.theme.MyCalculatorTheme
import ru.kredao.mycalculator.ui.screens.mainScreen.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                val systemUiController = rememberSystemUiController()

                val secondaryBackground = MaterialTheme.colorScheme.secondaryContainer
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = secondaryBackground,
                        darkIcons = false
                    )
                }
                MainScreen()
            }
        }
    }
}