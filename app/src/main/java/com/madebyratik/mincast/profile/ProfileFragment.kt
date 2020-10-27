package com.madebyratik.mincast.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.madebyratik.mincast.theme.MinCastTheme

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                MinCastTheme {
                    Text(
                        text = "Profile",
                        style = MaterialTheme.typography.h1,
                        modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()
                    )
                }
            }
        }
    }
}