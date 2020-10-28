package com.madebyratik.mincast.explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.platform.TextToolbarAmbient
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.madebyratik.mincast.R
import com.madebyratik.mincast.data.entities.Episode
import com.madebyratik.mincast.data.entities.Podcast
import com.madebyratik.mincast.data.episodes
import com.madebyratik.mincast.data.podcasts
import com.madebyratik.mincast.theme.MinCastTheme

@Composable
fun ExploreScreen(popularShows: List<Podcast>, recommendedEpisodes: List<Episode>) {
    Surface(modifier = Modifier.fillMaxSize()) {
        ScrollableColumn(modifier = Modifier.fillMaxWidth()) {
            ExploreHeading()
            PopularShowsSubheading()
            PopularShowsCarousel(shows = popularShows)
            RecommendedSubheading()
            RecommendedEpisodesCarousel(episodes = recommendedEpisodes)
        }
    }
}

@Composable
private fun ExploreHeading() {
    val context = ContextAmbient.current
    Text(
        text = context.getString(R.string.explore_label),
        style = MaterialTheme.typography.h1,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp).fillMaxWidth()
    )
}

@Composable
private fun PopularShowsSubheading() {
    val context = ContextAmbient.current
    Text(
        text = context.getString(R.string.popular_shows_label),
        style = MaterialTheme.typography.h2,
        modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()
    )
}

@Composable
private fun PopularShow(show: Podcast) {
    Column(
        modifier = Modifier
            .width(242.dp)
            .padding(10.dp)
    ) {
        Image(
            asset = imageResource(id = show.thumbnailResId),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.preferredHeight(8.dp))
        Text(
            text = show.name,
            maxLines = 2,
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .height(54.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
private fun PopularShowsCarousel(shows: List<Podcast>) {
    LazyRowFor(
        items = shows,
        modifier = Modifier.padding(start = 6.dp, top = 12.dp, bottom = 16.dp),
    ) { show ->
        PopularShow(show = show)
    }
}

@Composable
private fun RecommendedSubheading() {
    val context = ContextAmbient.current
    Text(
        text = context.getString(R.string.recommended_label),
        style = MaterialTheme.typography.h2,
        modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()
    )
}

@Composable
private fun RecommendedEpisode(episode: Episode) {
    Column(
        modifier = Modifier
            .width(148.dp)
            .padding(10.dp)
    ) {
        Image(
            asset = imageResource(id = episode.artworkResId),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.preferredHeight(10.dp))
        Text(
            text = episode.name,
            maxLines = 1,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = episode.metadata(),
            maxLines = 1,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun RecommendedEpisodesCarousel(episodes: List<Episode>) {
    LazyRowFor(
        items = episodes,
        modifier = Modifier.padding(start = 6.dp, top = 12.dp),
    ) { episode ->
        RecommendedEpisode(episode = episode)
    }
}

@Preview("Explore screen preview")
@Composable
fun ExploreScreenPreview() {
    MinCastTheme {
        ExploreScreen(
            popularShows = emptyList(),
            recommendedEpisodes = emptyList()
        )
    }
}

@Preview("Popular show card")
@Composable
fun PopularShowCardPreview() {
    val testPod = podcasts.first()

    MinCastTheme {
        Surface {
            PopularShow(testPod)
        }
    }
}

@Preview("Recommended episode card")
@Composable
fun RecommendedEpisodeCardPreview() {
    val testEpisode = episodes.first()

    MinCastTheme {
        Surface {
            RecommendedEpisode(testEpisode)
        }
    }
}