package com.example.practice_post_mvvm.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database(version = 1, entities = [StudentEntity::class])
abstract class StudentDatabase : RoomDatabase() {

    abstract fun studentDao() : StudentDao

    companion object{
        @Volatile
        private var INSTANCE : StudentDatabase? = null

        fun getDatabase(context: Context) : StudentDatabase{
            return INSTANCE?: synchronized(this) {
                val instance = Room.databaseBuilder(context,StudentDatabase::class.java, "student_database").build()

                INSTANCE = instance
                return instance
            }
        }
    }
}