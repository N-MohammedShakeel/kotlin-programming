package Introduction

class Variables {
}

fun main(){

//Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
// you'll usually let the compiler do the work by inferring it. Kotlin does not enforce immutability,
// though it is recommended. In essence use val over var.

    //Declares a mutable variable and initializes it.
    var a: String = "initial"
    println(a)

    //Declares an immutable variable
    val b: Int = 1
    val c = 3


    var e: Int
   // println(e) //Variable 'e' must be initialized
}