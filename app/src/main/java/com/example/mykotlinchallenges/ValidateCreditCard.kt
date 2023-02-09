package com.example.mykotlinchallenges

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.format.DateTimeFormatter

/*
3) validate a credit card:
Input is a card number and expiry date.
Output should be valid or not.

First 4 digits should be either
1111, 1232, 5627, 8121

Last 4 digits should be expiry date mm/yy

Input: 1111-2321-7625-1234
Input2: 12/34
 */
fun main(){
    val cardNumber: String = "11115678910111211234"
    if(validateCreditCard(cardNumber)) println("Your card is valid!")
    else println("Your card is invalid!")
}

fun validateCreditCard(cardNumber: String): Boolean {
    if(checkFirstFour(cardNumber.substring(0,4))) {
        return true
    }
    return false
}

fun checkFirstFour(substring: String): Boolean {
    if( substring == "1111" ||
        substring == "2321" ||
        substring == "7625" ||
        substring == "1234")
    {
        return true
    }
    return false
}