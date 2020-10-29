package com.madebyratik.mincast.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.madebyratik.mincast.R
import com.madebyratik.mincast.ui.components.ScreenTitle
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun ProfileScreen() {
    val context = ContextAmbient.current
    val title = context.getString(R.string.profile_label)

    Surface(modifier = Modifier.fillMaxSize()) {
        ScreenTitle(text = title)
    }
}

@Preview("Profile Screen")
@Composable
fun ProfileScreenPreview() {
    MinCastTheme {
        ProfileScreen()
    }
}

@Preview("Profile Screen • Dark Mode")
@Composable
fun ProfileScreenDarkPreview() {
    MinCastTheme(darkTheme = true) {
        ProfileScreen()
    }
}
