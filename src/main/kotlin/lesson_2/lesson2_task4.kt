package org.example.lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11

    val buff = 1.2
    val crystallineOreBuff = (crystallineOre * buff) - crystallineOre
    val ironOreBuff = (ironOre * buff) - ironOre

    println("crystallineOre buff is ${crystallineOreBuff.toInt()}")
    println("ironOre buff is ${ironOreBuff.toInt()}")

}