package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeOfTrainStartRaw = "9:39"
    val timeOfTrainTravel = 457

    val (hours, minutes) = timeOfTrainStartRaw.split(":").map { it.toInt() }
    val timeOfTrainStart = hours * MINUTES_IN_HOUR + minutes
    val timeOfArrival = timeOfTrainStart + timeOfTrainTravel

    val hoursOfArrivalFormat = timeOfArrival / MINUTES_IN_HOUR
    val minutesOfArrivalFormat = hoursOfArrivalFormat % MINUTES_IN_HOUR
    val formattedTime = String.format("%02d:%02d", hoursOfArrivalFormat, minutesOfArrivalFormat)
    println(formattedTime)

}