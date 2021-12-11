package com.example.uhaultest.repository

import android.widget.Toast
import com.example.uhaultest.data.UserApi
import com.example.uhaultest.data.responses.Posts
import com.example.uhaultest.data.responses.User
import com.example.uhaultest.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UserRepository @Inject constructor(
    private val api: UserApi
) {

    suspend fun getUserList(): Resource<List<User>> {
        val response = try {
            api.getUserList()
        } catch(e: Exception) {
            return Resource.Error("Error finding User Data.")
        }
        return Resource.Success(response)
    }

    suspend fun getUserPosts(userId: String): Resource<List<Posts>> {
        val response = try {
            api.getUserPosts(userId)
        } catch(e: Exception) {
            return Resource.Error("Error Finding User Posts")
        }
        return Resource.Success(response)
    }

    suspend fun createNewUserPost(newPost: Posts) {
        val response = try {
            api.createNewUserPost(newPost)
        } catch(e: Exception) {
            println(e.message)
        }
    }

    suspend fun deleteUserPost(userId: Int) {
        val response = try {
            api.deleteUserPost(userId)
        } catch(e: Exception) {
            println(e.message)
        }
    }
}