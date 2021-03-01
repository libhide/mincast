package com.madebyratik.mincast.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            bitmap = ImageBitmap.imageResource(id = podcast.thumbnailResId),
            contentDescription = podcast.name,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
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

