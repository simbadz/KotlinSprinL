package org.example.lesson_2

const val minutesInHour = 60

fun main() {
    val timeOfTrainStartRaw = "9:39"
    val timeOfTrainTravel = 457

    val (hours, minutes) = timeOfTrainStartRaw.split(":").map { it.toInt() }
    val timeOfTrainStart = hours * minutesInHour + minutes
    val timeOfArrival = timeOfTrainStart + timeOfTrainTravel

    val hoursOfArrivalFormat = timeOfArrival / minutesInHour
    val minutesOfArrivalFormat = hoursOfArrivalFormat % minutesInHour
    val formattedTime = String.format("%02d:%02d", hoursOfArrivalFormat, minutesOfArrivalFormat)
    println(formattedTime)

}