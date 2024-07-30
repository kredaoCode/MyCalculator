package ru.kredao.mycalculator

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {
    val score = mutableStateOf<String>("sdf")

    fun start() {
        score.value = "gf;kdgsfjdj;j"
    }
}