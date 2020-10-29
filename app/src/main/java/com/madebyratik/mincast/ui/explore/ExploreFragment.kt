package com.madebyratik.mincast.ui.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.madebyratik.mincast.data.FakePodcastsRepo
import com.madebyratik.mincast.ui.theme.MinCastTheme

class ExploreFragment : Fragment() {

    private val viewModel = ExploreViewModel(podcastsRepo = FakePodcastsRepo())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                MinCastTheme {
                    ExploreScreen(
                        podcasts = viewModel.getPopularPodcasts(),
                        recommendedEpisodes = viewModel.getRecommendedEpisodes()
                    )
                }
            }
        }
    }
}