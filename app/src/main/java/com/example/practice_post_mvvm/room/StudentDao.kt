package com.example.practice_post_mvvm.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentDao {

    @Query("SELECT * FROM student_table")
    suspend fun getAllStudents() : List<StudentEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudents(students : List<StudentEntity>)

    @Query("DELETE FROM student_table")
    suspend fun deleteAllStudents()
}