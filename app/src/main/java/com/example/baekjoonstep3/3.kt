package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    var sum = 0
    for(i in 1..n)
        sum+=i
    println(sum)
}