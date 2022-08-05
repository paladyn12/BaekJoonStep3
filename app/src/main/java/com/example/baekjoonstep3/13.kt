package com.example.baekjoonstep3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true){
        val str = br.readLine() ?: break
        val token = StringTokenizer(str)
        val sum = (token.nextToken().toInt()+token.nextToken().toInt()).toString()
        bw.write(sum+"\n")
    }
    bw.flush()
    bw.close()
}