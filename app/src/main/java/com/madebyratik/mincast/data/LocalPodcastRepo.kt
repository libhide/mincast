package com.madebyratik.mincast.data

import com.madebyratik.mincast.R
import com.madebyratik.mincast.data.entities.Episode
import com.madebyratik.mincast.data.entities.Podcast

class LocalPodcastRepo : PodcastRepo {

    override fun getPopularPodcasts(): List<Podcast> {
        return podcasts
    }

    override fun getRecommendedEpisodes(): List<Episode> {
        return episodes
    }
}

/**
 * Static data
 */

val podcasts = listOf(
    Podcast(name = "Waveform", thumbnailResId = R.drawable.thumb_waveform),
    Podcast(name = "Developer Tea", thumbnailResId = R.drawable.thumb_developer_tea),
    Podcast(
        name = "David Tennant Does a Podcast With...",
        thumbnailResId = R.drawable.thumb_david_tennant
    ),
    Podcast(
        name = "The Seen and the Unseen",
        thumbnailResId = R.drawable.thumb_seen_unseen
    ),
    Podcast(name = "Vergecast", thumbnailResId = R.drawable.thumb_vergecast),
)

val episodes = listOf(
    Episode(
        name = "The Walls Close In",
        publishDelta = "10h",
        duration = 45,
        artworkResId = R.drawable.artwork_tal
    ),
    Episode(
        name = "The Art of Gathering",
        publishDelta = "2d",
        duration = 30,
        artworkResId = R.drawable.artwork_hurry_slowly
    ),
    Episode(
        name = "Language with a Capital L",
        publishDelta = "2d",
        duration = 51,
        artworkResId = R.drawable.artwork_unbox
    ),
    Episode(
        name = "How do you make a stack overflow?",
        publishDelta = "5d",
        duration = 27,
        artworkResId = R.drawable.artwork_basecs
    ),
    Episode(
        name = "King Kunta by Kendrick Lamar",
        publishDelta = "1d",
        duration = 25,
        artworkResId = R.drawable.artwork_dissect
    )
)