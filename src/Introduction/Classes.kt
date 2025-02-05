package Introduction

class Classes {
}

//The class declaration consists of the class name,
// the class header (specifying its type parameters,
// the primary constructor etc.) and the class body,
// surrounded by curly braces. Both the header and the body are optional;
// if the class has no body, curly braces can be omitted.

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact1 = Contact(1, "mary@gmail.com")
    val contact2 = Contact(2, "ms@gmail.com")


    println(contact1.id)
    println(contact1.email)
    contact1.email = "jane@gmail.com"
    println(contact1.email)

    println(contact2.id)
    println(contact2.email)

}