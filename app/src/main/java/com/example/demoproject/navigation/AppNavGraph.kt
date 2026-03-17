package com.example.demoproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.demoproject.presentation.posts.PostDetailScreen
import com.example.demoproject.presentation.posts.PostsRoute

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Posts.route
    ) {

        composable(Screen.Posts.route) {

            PostsRoute(
                onPostClick = { postId ->
                    navController.navigate(
                        Screen.PostDetail.createRoute(postId)
                    )
                }
            )
        }

        composable(
            route = Screen.PostDetail.route,
            arguments = listOf(
                navArgument(Arguments.POST_ID) {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            val postId =
                backStackEntry.arguments?.getInt(
                    Arguments.POST_ID
                ) ?: 0

            PostDetailScreen(
                postId = postId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}