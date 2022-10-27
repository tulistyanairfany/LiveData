package com.example.livedata

import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {
    private val listOfTodos = mutableListOf<TodoModel>()
    init {
        listOfTodos.add(TodoModel("Tulistyana Irfany Bintang", "225150209111006", "Menonton film", R.drawable.fany))
        listOfTodos.add(TodoModel("Pramesti Dyah Wardani", "225150209111011", "Mendengarkan musik", R.drawable.dyah))
        listOfTodos.add(TodoModel("Kayla Shareta Andien", "225150209111003", "Bermain video game", R.drawable.kayla))
    }

    fun getTodos() = listOfTodos
}
