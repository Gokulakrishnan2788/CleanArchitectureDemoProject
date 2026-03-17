package com.example.demoproject.presentation.posts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun PostsRoute(
    onPostClick: (Int) -> Unit,
    viewModel: PostsViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        if (uiState.posts.isEmpty()) {
            viewModel.fetchPosts()
        }
    }

    PostsScreen(
        uiState = uiState,
        onRefresh = { viewModel.fetchPosts() },
        onPostClick = onPostClick
    )
}
