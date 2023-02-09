package com.example.mykotlinlearning

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//launch oe async
fun main() = runBlocking{
    launch{ sayHello()}
    async { sayHello() }
    println("stuff")
}
suspend fun sayHello(){
    delay(100)
    println("Hello")
}
