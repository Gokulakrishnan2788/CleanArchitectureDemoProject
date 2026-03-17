package com.example.demoproject.domain.posts.repository

import com.example.demoproject.domain.posts.model.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
}
