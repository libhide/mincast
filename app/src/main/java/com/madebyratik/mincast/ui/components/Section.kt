package com.madebyratik.mincast.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Section(
    title: String,
    modifier: Modifier = Modifier,
    Content: @Composable () -> Unit,
) {
    Box(modifier = modifier.padding(bottom = 16.dp)) {
        Column {
            SectionTitle(
                text = title,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Content()
        }
    }
}