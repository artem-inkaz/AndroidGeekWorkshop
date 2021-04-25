package com.example.androidgeekworkshop.lesson1

object SomeRepository {
    val data = FirstClass("Artem", "Ternovenko")

    fun dataClassCopy(): String {
        return data.copy().toString()
    }
}