package com.madebyratik.mincast.explore

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
import androidx.fragment.app.viewModels
import com.madebyratik.mincast.data.LocalPodcastRepo
import com.madebyratik.mincast.theme.MinCastTheme

class ExploreFragment : Fragment() {

    private val viewModel = ExploreViewModel(podcastRepo = LocalPodcastRepo())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                MinCastTheme {
                    ExploreScreen(
                        popularShows = viewModel.getPopularPodcasts(),
                        recommendedEpisodes = viewModel.getRecommendedEpisodes()
                    )
                }
            }
        }
    }
}