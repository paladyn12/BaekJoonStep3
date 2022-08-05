package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    for(i in 1..n){
        for(j in i..n-1) print(" ")
        for(j in 1..i) print("*")
        println()
    }
}