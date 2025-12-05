package org.example.lesson_3

fun main() {
    val receivingMove: String = "D2-D4;0"

    val separate = receivingMove.split(';')
    val movePart = separate[0]
    val numberPart = separate[1]

    val position = movePart.split('-')
    val fromWhere = position[0]
    val where = position[1]

    println("From where: $fromWhere")
    println("Where: $where")
    println("Number of move: $numberPart")
}
