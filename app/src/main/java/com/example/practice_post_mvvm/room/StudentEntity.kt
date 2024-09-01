package com.example.practice_post_mvvm.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("student_table")
data class StudentEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val studentName: String?,
    val programName: String?,
    val courseCode: String?,
    val studentType: String?,
    val dueAmount: String?,
    val totalPrice: String?,
    val score: String?,
)
