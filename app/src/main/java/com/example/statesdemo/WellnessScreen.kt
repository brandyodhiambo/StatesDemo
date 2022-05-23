package com.example.statesdemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(
    taskName: String,
    onClose: ()-> Unit,
    modifier: Modifier = Modifier
) {
    WaterCounter(modifier)
}