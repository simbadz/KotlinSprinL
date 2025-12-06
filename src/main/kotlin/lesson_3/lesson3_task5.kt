package org.example.lesson_3

fun main() {
    val receivingMove: String = "D2-D4;0"

    val separate = receivingMove.split('-',';')
    val fromWhere = separate[0]
    val where = separate[1]
    val numberPart = separate[2]

    println("From where: $fromWhere")
    println("Where: $where")
    println("Number of move: $numberPart")
}
