package com.example.androidgeekworkshop.lesson1

data class FirstClass(
    val name: String,
    val secondName: String
)

object FirstClassCopy {

    private val firstClass: List<FirstClass>
        get() {
            return firstClass
        }

    @JvmName("getFirstClass1")
    fun getFirstClass(): List<FirstClass> {
        return firstClass
    }
}
