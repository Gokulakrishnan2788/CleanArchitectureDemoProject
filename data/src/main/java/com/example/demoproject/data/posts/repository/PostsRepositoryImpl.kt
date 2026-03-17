package com.example.demoproject.data.posts.repository

import com.example.demoproject.data.posts.remote.PostsRemoteDataSource
import com.example.demoproject.domain.posts.model.Post
import com.example.demoproject.domain.posts.repository.PostsRepository
import javax.inject.Inject

class PostsRepositoryImpl @Inject constructor(
    private val remoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getPosts(): List<Post> = remoteDataSource.fetchPosts()
}
