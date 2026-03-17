package com.example.demoproject.presentation.posts

import com.example.demoproject.domain.posts.model.Post

data class PostsUiState(
    val isLoading: Boolean = false,
    val posts: List<Post> = emptyList(),
    val errorMessage: String? = null
)
