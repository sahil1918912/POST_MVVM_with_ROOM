package com.example.practice_post_mvvm.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.practice_post_mvvm.model.InstructorStudentListItem
import com.example.practice_post_mvvm.repo.StudentRepository
import com.example.practice_post_mvvm.room.StudentEntity
import com.google.gson.Gson
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = StudentRepository(application)
//    private val _students = MutableLiveData<List<InstructorStudentListItem>> ()
//    val students : LiveData<List<InstructorStudentListItem>> get() = _students

    private val _students = MutableLiveData<List<StudentEntity>> ()
    val students : LiveData<List<StudentEntity>> get() = _students

    fun fetchStudents(isOnline : Boolean) {
        viewModelScope.launch {
            try {
//                val response = repository.getStudents()
//                _students.postValue(response.InstructorStudentList as List<InstructorStudentListItem>?)
//                val str = Gson().toJson(response)
//                Log.i("TAG", "${response.StatusMessage.toString()}")
//                Log.i("TAG", "${str.toString()}")


                val studentList = repository.getStudents(isOnline)
                _students.postValue(studentList)
                val str = Gson().toJson(studentList)
                Log.i("TAG", "${studentList.toString()}")
                Log.i("TAG", "${str.toString()}")
                Log.i("TAG", "Successfully received json DATA")

            } catch (e: Exception) {
                Log.i("TAG", "${e.message.toString()} ")
            }

        }
    }
}