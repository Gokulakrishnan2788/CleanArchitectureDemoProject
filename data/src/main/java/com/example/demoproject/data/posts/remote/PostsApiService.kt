package com.example.demoproject.data.posts.remote

import com.example.demoproject.domain.posts.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostsApiService {
    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
}
