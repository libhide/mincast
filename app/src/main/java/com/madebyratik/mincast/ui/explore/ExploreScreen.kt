package com.madebyratik.mincast.ui.explore

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.madebyratik.mincast.R
import com.madebyratik.mincast.data.episodes
import com.madebyratik.mincast.data.podcasts
import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.model.Podcast
import com.madebyratik.mincast.ui.components.*
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun ExploreScreen(
    navController: NavController,
    podcasts: List<Podcast>,
    recommendedEpisodes: List<Episode>
) {
    Explore(podcasts = podcasts, recommendedEpisodes = recommendedEpisodes)
}

@Composable
fun Explore(podcasts: List<Podcast>, recommendedEpisodes: List<Episode>) {
    val context = LocalContext.current
    val title = context.getString(R.string.explore_label)
    val popularShowsTitle = context.getString(R.string.popular_shows_label)
    val recommendedTitle = context.getString(R.string.recommended_label)
    val showAllActionTitle = context.getString(R.string.show_all_label)

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            ScreenTitle(text = title)

            Section(
                title = popularShowsTitle,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                LazyRow {
                    items(podcasts) {
                        PodcastItem(podcast = it)
                    }
                }
            }

            SectionWithAction(
                title = recommendedTitle,
                actionButtonTitle = showAllActionTitle,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                LazyRow {
                    items(recommendedEpisodes) {
                        EpisodeItem(episode = it)
                    }
                }
            }
        }
    }
}

@Preview("Explore Screen")
@Composable
fun ExploreScreenPreview() {
    MinCastTheme {
        Explore(
            podcasts = podcasts,
            recommendedEpisodes = episodes
        )
    }
}

@Preview("Explore Screen • Dark Mode")
@Composable
fun ExploreScreenDarkPreview() {
    MinCastTheme(darkTheme = true) {
        Explore(
            podcasts = podcasts,
            recommendedEpisodes = episodes
        )
    }
}
