package dev.nhonnq.app.api

import dev.nhonnq.app.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    companion object {
        private const val USERS = "v1/users"
    }

    @GET(USERS)
    suspend fun fetchUsers(
        @Query("page") page: Int = 1,
        @Query("limit") limit: Int = 20
    ): Response<List<User>>

}