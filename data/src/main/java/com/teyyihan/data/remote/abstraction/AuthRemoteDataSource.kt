package com.teyyihan.data.remote.abstraction

import com.teyyihan.data.model.request.SignUpRequest
import com.teyyihan.data.model.response.TokenResponse
import retrofit2.http.Field

interface AuthRemoteDataSource {

    suspend fun getToken(username: String, password: String): TokenResponse

    suspend fun signUp(signUpRequest: SignUpRequest): String

}