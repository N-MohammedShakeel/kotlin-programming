package Introduction

//Generics are a genericity mechanism that's become standard in modern languages.
// Generic classes and functions increase code reusability by encapsulating common logic that is
// independent of a particular generic type, like the logic inside a List<T> is independent of what T is.

//Generic Classes

//The first way to use generics in Kotlin is creating generic classes.
class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

//Generic Functions

//You can also generify functions if their logic is independent of a specific type.
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)




fun main(){

    val m1 = MutableStack(1,2,3,4,5)

    m1.push(6)
    m1.push(7)
    m1.toString()
    println(m1.peek())
    println(m1.pop())
    m1.toString()
    println(m1.isEmpty())
    println(m1.size())

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}

