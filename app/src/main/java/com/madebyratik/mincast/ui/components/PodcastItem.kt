package com.madebyratik.mincast.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.madebyratik.mincast.data.podcasts
import com.madebyratik.mincast.model.Podcast
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun PodcastItem(podcast: Podcast, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .width(242.dp)
            .padding(end = 10.dp)
    ) {
        Image(
            asset = imageResource(id = podcast.thumbnailResId),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.preferredHeight(8.dp))
        Text(
            text = podcast.name,
            maxLines = 2,
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .height(54.dp)
        )
    }
}

@Preview("Podcast Item")
@Composable
fun PodcastItemPreview() {
    val podcast = podcasts.first()
    MinCastTheme {
        Surface {
            PodcastItem(podcast = podcast)
        }
    }
}

