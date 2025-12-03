package org.example.lesson_2

fun main() {
    val fulltimeEmployees = 50
    val fulltimeEmployeesSalary = 30000
    val interns = 30
    val internsSalary = 20000
    val internsSalaryTotal = interns * internsSalary
    val totalEmployees = fulltimeEmployees + interns

    val fulltimeEmployeesSalaryTotal = fulltimeEmployees * fulltimeEmployeesSalary
    val totalSalary = fulltimeEmployeesSalaryTotal + internsSalaryTotal
    val averageSalary = totalSalary / totalEmployees

    println(fulltimeEmployeesSalaryTotal)
    println(totalSalary)
    println(averageSalary)
}