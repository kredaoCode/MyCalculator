package ru.kredao.mycalculator.ui.screens.mainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.kredao.mycalculator.CalcViewModel
import ru.kredao.mycalculator.ui.components.keyButton.KeyButton

@Composable
fun MainScreen(myViewModel: CalcViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    4.dp,
                    clip = true,
                    shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp),
                )
                .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .padding(horizontal = 16.dp, vertical = 64.dp)
        ) {
            Text(
                text = myViewModel.text.value,
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.fillMaxWidth(),
                softWrap = false
            )
            Text(
                text = myViewModel.result.value,
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.fillMaxWidth(),
                softWrap = false
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                KeyButton("All Clear", long = true)
                KeyButton("/")
                KeyButton("*")
            }
            Row {
                KeyButton("7")
                KeyButton("8")
                KeyButton("9")
                KeyButton("-")
            }
            Row {
                KeyButton("4")
                KeyButton("5")
                KeyButton("6")
                KeyButton("+")
            }
            Row {
                KeyButton("1")
                KeyButton("2")
                KeyButton("3")
                KeyButton("=")
            }
            Row {
                KeyButton("0")
                KeyButton(".")
                KeyButton("delete", clear = true, long = true)
            }
        }
    }
}