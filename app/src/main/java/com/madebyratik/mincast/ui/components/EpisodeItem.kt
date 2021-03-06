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
import com.madebyratik.mincast.data.episodes
import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.ui.theme.MinCastTheme

@Composable
fun EpisodeItem(episode: Episode, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .width(148.dp)
            .padding(end = 10.dp)
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = episode.artworkResId),
            contentDescription = episode.name,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = episode.name,
            maxLines = 1,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier
        )
        Text(
            text = episode.metadata(),
            maxLines = 1,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier
        )
    }
}

@Preview("Episode Item")
@Composable
fun EpisodeItemPreview() {
    val episode = episodes.first()
    MinCastTheme {
        Surface {
            EpisodeItem(episode = episode)
        }
    }
}

