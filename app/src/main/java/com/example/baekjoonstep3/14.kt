package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    val firstN = nextInt()
    var newN = 100
    var count = 0
    var stepN = firstN
    while(firstN!=newN){
        newN = newNumber(stepN)
        stepN = newN
        count++
    }
    println(count)
}

fun newNumber(n : Int) : Int {
    var newN = (n/10 + n%10)%10 + (n%10)*10
    return newN
}