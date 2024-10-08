package com.example.quizapp.model

import java.util.UUID

data class Question(
    val id: UUID,
    val question: String,
    val image: Int? = null,
    val options: List<String>,
    val correctAnswer: Int
)
