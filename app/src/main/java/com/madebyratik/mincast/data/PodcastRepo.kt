package com.madebyratik.mincast.data

import com.madebyratik.mincast.data.entities.Episode
import com.madebyratik.mincast.data.entities.Podcast

interface PodcastRepo {
    fun getPopularPodcasts(): List<Podcast>
    fun getRecommendedEpisodes(): List<Episode>
}