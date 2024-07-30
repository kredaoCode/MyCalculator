package ru.kredao.mycalculator.ui.components.KeyButton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.kredao.mycalculator.CalcViewModel
import ru.kredao.mycalculator.R

@Composable
fun KeyButton(
    text: String = "",
    clear: Boolean = false,
    long: Boolean = false,
    calcVM: CalcViewModel = viewModel()
) {
    Button(
        onClick = { calcVM.start() },
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(24.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 4.dp
        ),
        contentPadding = PaddingValues(16.dp)

    ) {
        if (clear) {
            Icon(
                painter = painterResource(id = R.drawable.ic_clear),
                contentDescription = "clear",
                tint = MaterialTheme.colorScheme.primary
            )
        } else {
            Text(
                text = text,
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .size(if (long) 134.dp else 47.dp, 47.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}