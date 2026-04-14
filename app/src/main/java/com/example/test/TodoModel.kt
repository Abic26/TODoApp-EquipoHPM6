package com.example.test

enum class Category {
    Personal, Trabajo, Universidad
}

enum class Priority {
    Alta, Media, Baja
}

data class TodoTask(
    val id: Int,
    val title: String,
    val category: Category,
    val priority: Priority,
    val isCompleted: Boolean = false,
    val alarmTime: Long? = null
)
