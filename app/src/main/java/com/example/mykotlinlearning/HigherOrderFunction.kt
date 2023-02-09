package com.example.mykotlinlearning

fun main() {

    val callFun = {
        println("Hey, I am from Lambda Fun!")
    } //Lambda

    println(callFun())  // higher order function

    val addFun = { a: Int, b: Int ->
        a + b
    }
    println(addFun(2, 3))
}