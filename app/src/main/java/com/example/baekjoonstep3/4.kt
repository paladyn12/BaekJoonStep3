package com.example.baekjoonstep3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in 1..br.readLine().toInt()){
        val token = StringTokenizer(br.readLine())
        val sum = (token.nextToken().toInt()+token.nextToken().toInt()).toString()
        bw.write(sum+"\n")
    }
    bw.flush()
    bw.close()
}