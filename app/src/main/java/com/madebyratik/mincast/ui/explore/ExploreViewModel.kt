package com.madebyratik.mincast.ui.explore

import androidx.lifecycle.ViewModel
import com.madebyratik.mincast.data.PodcastsRepo
import com.madebyratik.mincast.model.Episode
import com.madebyratik.mincast.model.Podcast

class ExploreViewModel(private val podcastsRepo: PodcastsRepo): ViewModel() {

    fun getPopularPodcasts(): List<Podcast> {
        return podcastsRepo.getPopularPodcasts()
    }

    fun getRecommendedEpisodes(): List<Episode> {
        return podcastsRepo.getRecommendedEpisodes()
    }
}