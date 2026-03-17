package com.example.demoproject.domain.posts.usecase

import com.example.demoproject.domain.posts.model.Post
import com.example.demoproject.domain.posts.repository.PostsRepository
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(
    private val repository: PostsRepository
) {
    suspend operator fun invoke(): List<Post> = repository.getPosts()
}
