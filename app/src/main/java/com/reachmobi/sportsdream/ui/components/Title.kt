package com.reachmobi.sportsdream.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(title: String) {
    Text(
        text = title,
        modifier = Modifier.padding(end = 5.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        maxLines = 1
    )
}