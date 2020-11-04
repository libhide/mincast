package com.madebyratik.mincast.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.ui.tooling.preview.Preview
import com.madebyratik.mincast.R
import com.madebyratik.mincast.ui.components.ScreenTitle
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun ProfileScreen(navController: NavController) {
    Profile()
}

@Composable
fun Profile() {
    val context = ContextAmbient.current
    val title = context.getString(R.string.profile_label)

    Surface(modifier = Modifier.fillMaxSize()) {
        ScreenTitle(
            text = title,
            modifier = Modifier.wrapContentSize(align = Alignment.TopStart)
        )
    }
}

@Preview("Profile Screen")
@Composable
fun ProfileScreenPreview() {
    MinCastTheme {
        Profile()
    }
}

@Preview("Profile Screen • Dark Mode")
@Composable
fun ProfileScreenDarkPreview() {
    MinCastTheme(darkTheme = true) {
        Profile()
    }
}
