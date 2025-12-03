package org.example.variables_lesson1

fun main() {
    val totalSecondsInSpaceUraGagarin: Int = 6480

    val hours: Int = totalSecondsInSpaceUraGagarin / 3600
    val minutes: Int = (totalSecondsInSpaceUraGagarin % 3600) / 60
    val seconds: Int = totalSecondsInSpaceUraGagarin % 60

    val timeFormat = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(timeFormat)
}
