package com.example.mobileaplikasitugas.adapter

import java.util.Date

data class News(
    val title: String,
    val content: String,
    val author: String,
    val publishDate: Date,
    val imageUrl: String?,
    val tags: List<String>,
    var viewsCount: Int,
    val likesCount: Int,
) {
    val description: CharSequence? = null
}