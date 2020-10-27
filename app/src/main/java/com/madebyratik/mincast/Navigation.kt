package com.madebyratik.mincast

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.security.InvalidParameterException

enum class Screen { Explore, Saved, Search, Profile }

fun Fragment.navigate(to: Screen, from: Screen) {
    if (to == from) {
        throw InvalidParameterException("Can't navigate to $to")
    }
    when (to) {
        Screen.Explore -> {
            findNavController().navigate(R.id.explore_fragment)
        }
        Screen.Saved -> {
            findNavController().navigate(R.id.saved_fragment)
        }
        Screen.Search -> {
            findNavController().navigate(R.id.search_fragment)
        }
        Screen.Profile -> {
            findNavController().navigate(R.id.profile_fragment)
        }
    }
}
