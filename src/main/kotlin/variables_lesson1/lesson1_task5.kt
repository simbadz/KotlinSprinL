package org.example.variables_lesson1

const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60

fun main() {
    val totalSecondsInSpaceUraGagarin: Int = 6480

    val hours: Int = totalSecondsInSpaceUraGagarin / SECONDS_IN_HOUR
    val minutes: Int = (totalSecondsInSpaceUraGagarin % SECONDS_IN_HOUR) / MINUTES_IN_HOUR
    val seconds: Int = totalSecondsInSpaceUraGagarin % MINUTES_IN_HOUR

    val timeFormat = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(timeFormat)
}
