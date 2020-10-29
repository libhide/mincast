package com.madebyratik.mincast.data

import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.model.Podcast

interface PodcastsRepo {
    fun getPopularPodcasts(): List<Podcast>
    fun getRecommendedEpisodes(): List<Episode>
}