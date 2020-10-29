package com.madebyratik.mincast.data

import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.model.Podcast

class FakePodcastsRepo : PodcastsRepo {

    override fun getPopularPodcasts(): List<Podcast> {
        return podcasts
    }

    override fun getRecommendedEpisodes(): List<Episode> {
        return episodes
    }
}
