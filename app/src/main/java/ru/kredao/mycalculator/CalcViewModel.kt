package ru.kredao.mycalculator

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class CalcViewModel: ViewModel() {
    val text = mutableStateOf<String>("")
    val result = mutableStateOf<String>("")

    fun addSymbol(symbol: String) {
        when (symbol) {
            "All Clear" -> {
                text.value = ""
            }
            "delete" -> {
                text.value = text.value.dropLast(1)
            }
            "=" -> {
                result.value = toResult(text.value)
            }
            else -> {
                text.value = text.value + symbol
            }
        }
    }
}

fun toResult(text: String): String {
    return ExpressionBuilder(text).build().evaluate().toString()
}