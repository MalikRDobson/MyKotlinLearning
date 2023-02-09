package com.example.mykotlinlearning

fun main(){
    val myLazyVal: String by lazy { "I am Lazy" }
    println(myLazyVal)

    lateinit var myLateInitVar: String
    myLateInitVar = "I am late initializng"
    println(myLateInitVar)
}