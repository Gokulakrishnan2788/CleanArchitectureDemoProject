package com.example.demoproject.navigation

sealed class Screen(val route: String) {

    data object Posts : Screen(RouteConstants.POSTS)

    data object PostDetail :
        Screen("${RouteConstants.POST_DETAIL}/{${Arguments.POST_ID}}") {

        fun createRoute(postId: Int): String {
            return "${RouteConstants.POST_DETAIL}/$postId"
        }
    }
}


object RouteConstants {

    const val POSTS = "posts"

    const val POST_DETAIL = "postDetail"



}
object Arguments{
    const val POST_ID = "postId"
}