package com.madebyratik.mincast.data.entities

data class Episode(
    val name: String,
    val publishDelta: String,
    val duration: Int,
    val artworkResId: Int
) {
    fun metadata() = "$publishDelta • ${duration}min"
}