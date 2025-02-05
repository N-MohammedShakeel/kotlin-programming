package Introduction

//Default Parameter Values and Named Arguments

fun printMessage(message: String): Unit {           // no return value
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") { // The return type is omitted, meaning that it's actually Unit.
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

//Functions with vararg Parameters
//Varargs allow you to pass any number of arguments by separating them with commas.

fun printAll(vararg messages: String) {
    for (m in messages)
        println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages)
        println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries) // the special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
}



fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))


    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )
    log("Hello", "Hallo", "Salut", "Hola", "你好")


//Infix Functions
//Member functions and extensions with a single parameter can be turned into infix functions.

//Operator Functions
//Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.

    infix fun Int.shl(x: Int): Int {
       return shl(x) + x
    }

    // calling the function using the infix notation
    println(1 shl 2)

    // is the same as
    1.shl(2)

    // we can use both infix and operator in same function
    infix operator fun Int.times(str: String): String = str.repeat(this)
    println(2 times "Bye ")
    println(2 * "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia


    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

}



class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
        println(likedPeople[0].name);
    }
}