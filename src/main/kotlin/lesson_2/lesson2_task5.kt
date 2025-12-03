package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientAmount = 70_000
    val lendingRate = 16.7
    val depositPeriodYears = 20

    val compoundInterest = clientAmount * (1 + lendingRate / 100).pow(depositPeriodYears)
    println("%.3f".format(compoundInterest))
}