package com.example.practice_post_mvvm.Network


import com.example.practice_post_mvvm.model.RequestModel
import com.example.practice_post_mvvm.model.Student
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("InstructorStudentList")
    suspend fun getStudentData(
        @Header("HashToken") hashToken: String,
        @Body requestBody: RequestModel
    ): Student
}