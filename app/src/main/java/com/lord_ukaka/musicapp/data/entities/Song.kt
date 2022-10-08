package com.lord_ukaka.musicapp.data.entities

data class Song(
    val mediaId: String = "",
    val title: String = "",
    val subtitle: String = "",
    val imageUrl: String = "",
    val songUrl: String = ""
)

// You have to set default values in your data class because firestore requires you do so.