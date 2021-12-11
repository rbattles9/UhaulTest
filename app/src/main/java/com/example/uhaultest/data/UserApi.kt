package com.example.uhaultest.data

import com.example.uhaultest.data.responses.Posts
import com.example.uhaultest.data.responses.User
import retrofit2.http.*

interface UserApi {

    @GET("users")
    suspend fun getUserList(
    ): List<User>

    @GET("posts?userId={userId}")
    suspend fun getUserPosts(
        @Query("userId") name: String
    ): List<Posts>

    @POST("posts")
    suspend fun createNewUserPost(
        @Body() newPost: Posts
    )

    @POST("posts/{postId}")
    suspend fun deleteUserPost(
        @Field("postId") postId: Int
    )

}