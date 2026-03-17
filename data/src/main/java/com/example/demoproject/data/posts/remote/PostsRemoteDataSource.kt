package com.example.demoproject.data.posts.remote

import com.example.demoproject.domain.posts.model.Post
import java.io.IOException
import javax.inject.Inject

class PostsRemoteDataSource @Inject constructor(
    private val apiService: PostsApiService
) {
    suspend fun fetchPosts(): List<Post> {
        val response = apiService.getPosts()
        if (response.isSuccessful) {
            return response.body() ?: emptyList()
        } else {
            throw IOException("Bad server response: ${response.code()}")
        }
    }
}
