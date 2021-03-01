package com.madebyratik.mincast.ui.saved

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.madebyratik.mincast.R
import com.madebyratik.mincast.ui.components.ScreenTitle
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun SavedScreen(navController: NavController) {
    Saved()
}

@Composable
fun Saved() {
    val context = LocalContext.current
    val title = context.getString(R.string.saved_label)

    Surface(modifier = Modifier.fillMaxSize()) {
        ScreenTitle(
            text = title,
            modifier = Modifier.wrapContentSize(align = Alignment.TopStart)
        )
    }
}

@Preview("Saved Screen")
@Composable
fun SavedScreenPreview() {
    MinCastTheme {
        Saved()
    }
}

@Preview("Saved Screen • Dark Mode")
@Composable
fun SavedScreenDarkPreview() {
    MinCastTheme(darkTheme = true) {
        Saved()
    }
}
