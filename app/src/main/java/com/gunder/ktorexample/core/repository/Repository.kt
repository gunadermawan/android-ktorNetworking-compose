package com.gunder.ktorexample.core.repository

import com.gunder.ktorexample.core.KtorClient
import com.gunder.ktorexample.model.Response
import io.ktor.client.request.get
import okio.use

object Repository {
    suspend fun getUserData() {
        return KtorClient.httpClient.use {
            it.get("https://dummy.restapiexample.com/api/v1/employees")
        }
    }
}