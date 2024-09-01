package com.example.practice_post_mvvm.model

data class Student(
    val Status: String? = null,
    val InstructorStudentList: List<InstructorStudentListItem?>? = null,
    val StatusMessage: String? = null
)


data class InstructorStudentListItem(
    val GPrice: String? = null,
    val DueAmount: String? = null,
    val Addons: String? = null,
    val CourseCode: String? = null,
    val IsEvaluationeligible: String? = null,
    val StudentType: String? = null,
    val StudentPaymentType: String? = null,
    val TotalExtraLessonCount: String? = null,
    val StudentPaymentStatus: String? = null,
    val PaidP1Amount: String? = null,
    val RoadTestaddonId: String? = null,
    val DrivingScore: String? = null,
    val AdvanceAvailable: String? = null,
    val Phone: String? = null,
    val DocumentDownloadLink: String? = null,
    val InstructorShare: String? = null,
    val TotalPurchasedExtraLesson: String? = null,
    val StudentAddress: String? = null,
    val PaymentStatus: String? = null,
    val StudentDue: String? = null,
    val Is10LessonCompleted: String? = null,
    val ExtraLessonType: String? = null,
    val Paidp3Amount: String? = null,
    val BalanceAmount: String? = null,
    val RegistrationId: String? = null,
    val LessonId: String? = null,
    val IsRoadTestPurchased: String? = null,
    val ProgramName: String? = null,
    val Score: String? = null,
    val TotalLessonCount: String? = null,
    val G2Price: String? = null,
    val TotalPrice: String? = null,
    val Id: String? = null,
    val PaidP2Amount: String? = null,
    val StudentName: String? = null,
    val IsEvaluationCompleted: String? = null
)
