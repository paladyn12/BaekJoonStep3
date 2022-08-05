package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var N = nextInt()
    var X = nextInt()
    for(i in 1..N){
        var num = nextInt()
        if(num<X) print("$num ")
    }
}