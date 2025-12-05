package org.example.lesson_3

fun main() {
    var fromWhere = "E2"
    var where = "E4"
    var moveNumber = "1"

    var strokeLength = "${fromWhere}:${where};$moveNumber"
    println("White's first move: $strokeLength")

    fromWhere = "D2"
    where = "D3"
    moveNumber = "2"
    strokeLength = "${fromWhere}:${where};$moveNumber"
    println("White's second move: $strokeLength")
}
