package com.example.mykotlinlearning

open class Shape{
    open fun sides() : Int = 100
}
class Square: Shape(){
    override fun sides(): Int = 4
}

fun main(){
    val square1 = Square()
    println(square1.sides())
}