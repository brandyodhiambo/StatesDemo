package com.example.statesdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    StatefulCounter(modifier)

    /* Column(modifier = Modifier.padding(16.dp)) {
         var count by remember { mutableStateOf(0) }
         if (count > 0) {
             var showTask by rememberSaveable { mutableStateOf(true) }
             if (showTask) {
                 WellnessTaskItem(
                     onClose = { showTask = false },
                     taskName = "Have you taken your 15 minute walk today?"

                 )
             }
             Text("You've had $count glasses.")
         }

         Button(onClick = { count++ }, enabled = count < 10) {
             Text("Add one")
         }
     }*/
}


//displays the count
@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}
//owns the count
@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, { count++ }, modifier)
}

