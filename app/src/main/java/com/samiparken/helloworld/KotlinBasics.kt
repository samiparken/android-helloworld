package com.samiparken.helloworld

fun main() {
    val lastName = "Park"   //immutable
    var myName = "Han-Saem" //mutable
    print("Hello " + myName + " " + lastName)
    // TODO: new comment style TODO:
    /* comment */

    /* INTEGER */
    val myAge = 32 //Int
    val myByte: Byte = 13 //1byte
    val myShort: Short = 123 //2byte
    val myInt: Int = 123123123 //4byte
    val myLong: Long = 345_230_495_203_485_029 //8byte

    /* Floating Point Number */
    val myFloat: Float = 13.123F  // ends with 'F', 4byte
    val myDouble: Double = 3.14159212456345 //8byte

    /* Boolean */
    var isSunny = true //bool

    /* Characters */
    val letterChar = 'A'
    val digitChar = '1'
    val otherChar = '$'

    /* Strings */
    val myStr = "HEEEELLLLOOO"
    val firstChar = myStr[0] // accessable with array
    val lastChar = myStr[myStr.length - 1]

    /* Arithmetic operators (+, -, *, /, %) */
    var result = 5+3
    result /= 2
    result *= 2
    result += 2
    result -= 2
    result %= 2

    /* Comparison operators (==, !=, <, >, <=, >=) */
    val isEqual = 1 == 2
    print("\n")
    println("isEqual is " + isEqual)
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")
    println("Is 5 greater 3 ? ${5>3}")
    println("Is 5 Lower Equal 3 ? ${5<=3}")


}