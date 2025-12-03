package org.example.lesson_2

fun main() {
    val timeOfTrainStart = 579
    val timeOfTrainTravel = 457

    val timeOfArrival = timeOfTrainStart + timeOfTrainTravel

    val hoursOfArrivalFormat = timeOfArrival / 60
    val minutesOfArrivalFormat = hoursOfArrivalFormat % 60
    val formattedTime = String.format("%02d:%02d", hoursOfArrivalFormat, minutesOfArrivalFormat)
    println(formattedTime)

}