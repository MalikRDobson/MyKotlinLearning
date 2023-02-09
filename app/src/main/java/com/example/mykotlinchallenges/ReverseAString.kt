package com.example.mykotlinchallenges

// 1) Reverse a string input: aaba -> abaa
fun main(){
    val input: String = "abcdefghijk"
    reverse(input)
}
fun reverse(input: String){
    var output = StringBuilder()
    for (i in input.length-1 downTo  0){
        output.append(input[i])
    }
    println(output)
}