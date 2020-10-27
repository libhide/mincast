package com.madebyratik.mincast.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.madebyratik.mincast.data.LocalPodcastRepo
import com.madebyratik.mincast.data.PodcastRepo
import com.madebyratik.mincast.data.entities.Episode
import com.madebyratik.mincast.data.entities.Podcast

class ExploreViewModel(private val podcastRepo: PodcastRepo): ViewModel() {
    fun getPopularPodcasts(): List<Podcast> {
        return podcastRepo.getPopularPodcasts()
    }

    fun getRecommendedEpisodes(): List<Episode> {
        return podcastRepo.getRecommendedEpisodes()
    }
}