package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    for(i in 1..9){
        println("$n * $i = "+i*n)
    }
}