package com.example.demoproject.presentation.posts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demoproject.domain.posts.model.Post
import com.example.demoproject.presentation.common.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostsScreen(
    uiState: UiState<List<Post>>,
    onRefresh: () -> Unit,
    onPostClick: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Posts") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Button(
                onClick = onRefresh,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Refresh Posts")
            }

            when (val state = uiState) {

                is UiState.Loading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }

                is UiState.Error -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = state.message,
                            color = Color.Red
                        )
                    }
                }

                is UiState.Success<*> -> {

                    val posts = state.data as? List<Post> ?: emptyList()

                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {

                        items(posts) { post ->

                            PostItem(
                                post = post,
                                onClick = { onPostClick(post.id) }
                            )

                            HorizontalDivider()
                        }
                    }
                }
            }


        }
    }
}

@Composable
fun PostItem(post: Post, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp)
    ) {
        Text(text = post.title, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = post.body, style = MaterialTheme.typography.bodyMedium)
    }
}
