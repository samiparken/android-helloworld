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
    val firstChar = myStr[0] // accessible with array
    val lastChar = myStr[myStr.length - 1]

    /* Arithmetic operators (+, -, *, /, %) */
    /* Assignment operators (+, -, *, /, %) */
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

    /* Increment & Decrement operators (++, --)*/
    println("result is $result")
    println("result is ${result++}")
    println("result is ${++result}")

    /* if statement */
    var isActive = true
    if (isActive) {
        println("true")
    } else {
        println("false")
    }

    /* when expressions */
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> print("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> print("Invalid Month")
    }

    var x : Any = 13.37f
    when(x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> print("$x is a String")
        !is String -> print("$x is not a String")
        else -> println("$x is none of the above")
    }
    print("\n")

    /* while loop */
    var w = 1
    while ( w <= 10) {
        print("$w\n")
        w++
    }

    /* do-while loop */
    var y = 1
    do {
        print("$y\n")
        y++
    } while (y > 10)
    println("$y\n")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "Comfy"
            println("It's comfy now")
        }
    }

    /* for loops */
    for( num in 1..10 ) {
        print("$num")
    }
    for( num2 in 1 until 10 ) { // same as 1.until(10)
        print("$num2")
    }
    for( num3 in 10 downTo 1 ) {
        print("$num3")
    }
    for( num4 in 10 downTo 1 step 2 ) {   // same as 10.downTo(1).step(2)
        print("$num4")
    }

    /* FUNCTIONS */
    // Method - a Method is a function within a class
    // Parameters VS arguments

    myFunction()
    val result2: Int = addUp(1,2) //arguments
    val result3 = avg(10.9,20.4)

    /* Nullable */
    var name2: String = "Han-Saem"
    var nullableName: String? = "Han-Saem"
    //nullableName = null

    var len = name2.length
    var len2 = nullableName?.length //the same as below
    /*
    if (nullableName != null) {
        len2 = nullableName.length
    } else {
        null
    }
    */
    println(nullableName?.lowercase())
    nullableName?.let {println(it.length)}

    // ?: Elvis operator
    var name3 = nullableName ?: "Guest"
    println("name is $name3")

    println(nullableName!!.lowercase())  // null exception if nullableName is null

    //example
//    val wifesAge: String? = user?.wife?.age ?: 0

    /* CLASS */
    var person1 = Person("Han-Saem", "Park")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")



}

fun myFunction() {
    print("\nCalled from myFunction\n")
}

fun addUp(a: Int, b: Int) : Int { //parameters
    return a + b
}

fun avg(a: Double, b: Double) : Double {
    return (a+b)/2
}

// it's possible to declare a variable with the same name as the parameter
// it's called Shadowing
fun myFunction(a:Int) {
    var a = a
}

/* CLASS */
class Person (firstName: String = "John", lastName: String = "Doe") {
    init {
        println("\nPerson created")
        println("Initialized a new person object with " +
        "firstName = $firstName and lastName = $lastName")
    }

}

