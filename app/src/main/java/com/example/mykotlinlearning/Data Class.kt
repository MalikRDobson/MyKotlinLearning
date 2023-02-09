package com.example.mykotlinlearning

data class Car(
    var make: String,
    var model: String,
    var year: Int,
    var mileage: Int,
    var price: Double
)

fun main(){
    val car1 = Car("Skoda", "superb", 2014, 120000,20.00)
    println("${car1.make} + ${car1.model} + ${car1.year} + ${car1.mileage} + ${car1.price}")
    car1.make = "Kia"
    car1.model = "Optima"
    car1.price =  30.00
    car1.year = 2016
    car1.mileage = 130789
    println("${car1.make} + ${car1.model} + ${car1.year} + ${car1.mileage} + ${car1.price}")
}