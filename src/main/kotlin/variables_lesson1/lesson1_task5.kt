package org.example.variables_lesson1

const val secondsInHour = 3600
const val minutesInHour = 60

fun main() {
    val totalSecondsInSpaceUraGagarin: Int = 6480

    val hours: Int = totalSecondsInSpaceUraGagarin / secondsInHour
    val minutes: Int = (totalSecondsInSpaceUraGagarin % secondsInHour) / minutesInHour
    val seconds: Int = totalSecondsInSpaceUraGagarin % minutesInHour

    val timeFormat = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(timeFormat)
}
