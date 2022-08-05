package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    for(i in 1..n){
        var A = nextInt()
        var B = nextInt()
        println("Case #$i: ${A+B}")
    }
}