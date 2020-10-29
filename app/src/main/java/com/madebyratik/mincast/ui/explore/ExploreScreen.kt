package com.madebyratik.mincast.ui.explore

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.madebyratik.mincast.R
import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.model.Podcast
import com.madebyratik.mincast.data.episodes
import com.madebyratik.mincast.data.podcasts
import com.madebyratik.mincast.ui.components.*
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun ExploreScreen(podcasts: List<Podcast>, recommendedEpisodes: List<Episode>) {
    val context = ContextAmbient.current
    val title = context.getString(R.string.explore_label)
    val popularShowsTitle = context.getString(R.string.popular_shows_label)
    val recommendedTitle = context.getString(R.string.recommended_label)
    val showAllActionTitle = context.getString(R.string.show_all_label)

    Surface(modifier = Modifier.fillMaxSize()) {
        ScrollableColumn(modifier = Modifier.fillMaxWidth()) {
            ScreenTitle(text = title)

            Section(
                title = popularShowsTitle,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                LazyRowFor(items = podcasts) {
                    PodcastItem(podcast = it)
                }
            }

            SectionWithAction(
                title = recommendedTitle,
                actionButtonTitle = showAllActionTitle,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                LazyRowFor(items = recommendedEpisodes) {
                    EpisodeItem(episode = it)
                }
            }
        }
    }
}

@Preview("Explore Screen")
@Composable
fun ExploreScreenPreview() {
    MinCastTheme {
        ExploreScreen(
            podcasts = podcasts,
            recommendedEpisodes = episodes
        )
    }
}

@Preview("Explore Screen • Dark Mode")
@Composable
fun ExploreScreenDarkPreview() {
    MinCastTheme(darkTheme = true) {
        ExploreScreen(
            podcasts = podcasts,
            recommendedEpisodes = episodes
        )
    }
}
