package com.example.practice_post_mvvm.repo

import android.content.Context
import com.example.practice_post_mvvm.Network.ApiInterface
import com.example.practice_post_mvvm.model.RequestModel
import com.example.practice_post_mvvm.room.StudentDatabase
import com.example.practice_post_mvvm.room.StudentEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class StudentRepository(context: Context) {
    private val api: ApiInterface
    val BASE_URL = " https://testapi.ultimatedrivers.ca/api/"
    private val studentDao = StudentDatabase.getDatabase(context).studentDao()

    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(100, TimeUnit.SECONDS)
            .readTimeout(100, TimeUnit.SECONDS).build()

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
        api = retrofit.create(ApiInterface::class.java)

    }

    val hasToken = "e9a9b11e-9630-486e-af79-7e0fa3d81278"

    val body = RequestModel(
        "1477",
        "1",
        "2024",
        "ALL",
        "",
        "",
        "",
        "",
        "1",
        ""
    )

    suspend fun getStudents(isOnline: Boolean): List<StudentEntity> {
        return if (isOnline) {
            val response = api.getStudentData(hasToken, body)

            val studentEntities = response.InstructorStudentList?.map { student ->
                StudentEntity(
                    studentName = student?.StudentName,
                    programName = student?.ProgramName,
                    courseCode = student?.CourseCode,
                    studentType = student?.StudentType,
                    dueAmount = student?.DueAmount,
                    totalPrice = student?.TotalPrice,
                    score = student?.Score
                )
            } ?: emptyList()

            withContext(Dispatchers.IO) {
                studentDao.deleteAllStudents()
                studentDao.insertStudents(studentEntities)
            }

            return studentEntities
        } else {
            studentDao.getAllStudents()
        }

    }/*api.getStudentData(hashToken = hasToken, requestBody = body) */
}