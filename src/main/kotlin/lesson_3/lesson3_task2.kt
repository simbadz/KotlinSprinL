package org.example.lesson_3

fun main() {
    var lastName = "Андреева"
    val name = "Татьяна"
    val middleName = "Сергеевна"
    var age: String = "20"

    age = "20"
    println("$lastName $name $middleName, $age лет")

    age = "22"
    lastName = "Сидорова"
    println("$lastName $name $middleName, $age года")
}