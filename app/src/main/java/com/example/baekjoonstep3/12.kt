package com.example.baekjoonstep3

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var A = nextInt()
    var B = nextInt()
    var sum = A+B
    while(sum != 0){
        println(sum)
        A = nextInt()
        B = nextInt()
        sum = A+B
    }
}