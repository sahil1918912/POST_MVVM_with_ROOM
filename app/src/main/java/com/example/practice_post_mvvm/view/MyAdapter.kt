package com.example.practice_post_mvvm.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice_post_mvvm.R
//import com.example.practice_post_mvvm.model.InstructorStudentListItem
import com.example.practice_post_mvvm.room.StudentEntity

class MyAdapter(private val list: List<StudentEntity>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> (){

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var studentName: TextView = v.findViewById(R.id.tvStudentName)
        var programName: TextView = v.findViewById(R.id.tvProgramName)
        var courseCode: TextView = v.findViewById(R.id.tvCourseCode)
        var studentType: TextView = v.findViewById(R.id.tvStudentType)
        var dueAmount: TextView = v.findViewById(R.id.tvDueAmount)
        var score: TextView = v.findViewById(R.id.tvScore)
        var totalPrice: TextView = v.findViewById(R.id.tvTotalPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val student = list[position]
//        holder.studentName.text = student.StudentName
//        holder.programName.text = student.ProgramName
//        holder.courseCode.text = student.CourseCode
//        holder.studentType.text = student.StudentType
//        holder.dueAmount.text = "$ "+ student.DueAmount
//        holder.score.text = student.Score
//        holder.totalPrice.text = "$ "+ student.TotalPrice

        holder.studentName.text = student.studentName
        holder.programName.text = student.programName
        holder.courseCode.text = student.courseCode
        holder.studentType.text = student.studentType
        holder.dueAmount.text = "$ "+ student.dueAmount
        holder.score.text = student.score
        holder.totalPrice.text = "$ "+ student.totalPrice
    }
}