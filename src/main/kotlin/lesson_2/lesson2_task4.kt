package org.example.lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buffPercent = 20

    val buff = 1 + buffPercent / 100.0
    val crystallineOreBuff = (crystallineOre * buff) - crystallineOre
    val ironOreBuff = (ironOre * buff) - ironOre

    println("crystallineOre buff is ${crystallineOreBuff.toInt()}")
    println("ironOre buff is ${ironOreBuff.toInt()}")

}