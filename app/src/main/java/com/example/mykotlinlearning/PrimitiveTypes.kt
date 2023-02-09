package com.example.mykotlinlearning

fun main(){

    val intTestValue: Int = 69
    val doubleTestValue: Double = 69.69
    val floatTestValue: Float = 69.69f
    val stringTestValue: String = "Such String, Much Code"

    println(doubleTestValue*floatTestValue)

    // Null Safety
    val intTestValueNull: Int? = null
    val doubleTestValueNull: Double? = null
    val floatTestValueNull: Float? = null
    val stringTestValueNull: String? = null

//    val listAnother = listOf<String>()
//    val listAnother1 = listOf("LG", "Malik")
//    val listOfRandom: List<CustomDataClass>

    var intTestValue1: Int = 69
    var doubleTestValue1: Double = 69.69
    var floatTestValue1: Float = 69.69f
    var stringTestValue1: String = "Such String, Much Code"

    // magic here with default function
    intTestValue1 = (420.69).toInt()
    floatTestValue1 = intTestValue1.toFloat()
    doubleTestValue1 = floatTestValue1.toDouble()
    stringTestValue1 = doubleTestValue1.toString()
}
