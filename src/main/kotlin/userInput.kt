import jdk.jfr.Period

import java.time.LocalDate
import java.time.Month
import java.time.MonthDay
import java.time.Period.between
import java.time.Year
import java.util.*
import javax.management.Query.between

fun main(){
    print("Enter First Name: ")
    val name = readLine()

    println("You have entered: $name")
    val currentYear = 2021

    print("Enter your Birth year: ")
    val inputYear = Scanner(System.`in`)
    val birthYear = inputYear.nextInt()

    println("$name's current age is ${currentYear-birthYear}")

    print("Enter your Birth Month: ")
    val inputMonth = Scanner(System.`in`)
    val birthMonth = inputMonth.nextInt()

    print("Enter your Birth Day: ")
    val inputDay = Scanner(System.`in`)
    val birthDay = inputDay.nextInt()

    val birthDate = LocalDate.of(birthYear, birthMonth,birthDay)
    val exactAge = birthDate.until(LocalDate.now())
    println("$name's exact age is ${exactAge.years} years, ${exactAge.months} months, and ${exactAge.days} days")

}
