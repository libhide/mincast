package com.madebyratik.mincast.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun SectionWithAction(
    title: String,
    actionButtonTitle: String,
    modifier: Modifier = Modifier,
    action: () -> Unit = {},
    Content: @Composable () -> Unit,
) {
    Box(modifier = modifier.padding(bottom = 16.dp)) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(bottom = 5.dp)
                    .fillMaxWidth()
            ) {
                SectionTitle(text = title)
                TextButton(onClick = action) {
                    Text(actionButtonTitle)
                }
            }
            Content()
        }
    }
}

@Preview("Section with Action")
@Composable
fun SectionWithActionPreview() {
    MinCastTheme {
        Surface {
            SectionWithAction(
                title = "Title",
                actionButtonTitle = "Action",
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(text = "Content")
            }
        }
    }
}