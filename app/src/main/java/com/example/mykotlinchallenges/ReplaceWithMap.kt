package com.example.mykotlinchallenges

/*
    2) Replace annotations in a string with the provided map.
    Example -> input one: "some random string @test challenge @okay"
    Input two: @test is Laptop, @okay is Gone
    Output: some random string Laptop challenge Gone

 */

fun main(){
    var input   = "some random string @test challenge @okay"
    var input2  = mapOf("@test" to "Laptop", "@okay" to "Gone")
    println(input)
    replaceTheString(input, input2)
}

fun replaceTheString(input: String, input2: Map<String, String>) {
    var output: String = input
    for((key,value) in input2){
        println(key)
        println(value)
        output = output.replace(key,value)
    }
    println(output)
}
