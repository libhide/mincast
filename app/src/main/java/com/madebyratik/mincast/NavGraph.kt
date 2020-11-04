package com.madebyratik.mincast

import androidx.annotation.StringRes

sealed class Screen(val route: String, @StringRes val resourceId: Int, val iconIdRes: Int) {
    object Explore : Screen("explore", R.string.explore_label, R.drawable.ic_explore)
    object Saved : Screen("saved", R.string.saved_label, R.drawable.ic_saved)
    object Search : Screen("search", R.string.search_label, R.drawable.ic_search)
    object Profile : Screen("profile", R.string.profile_label, R.drawable.ic_profile)
}