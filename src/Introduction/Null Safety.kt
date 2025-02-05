package Introduction

//In an effort to rid the world of NullPointerException,
// variable types in Kotlin don't allow the assignment of null.
// If you need a variable that can be null, declare it nullable by adding ? at the end of its type.

fun main(){
    var neverNull: String = "This can't be null"
    //neverNull = null  // CTE

    //Declares a nullable String variable.
    var nullable: String? = "You can keep a null here"
    nullable = null

    //When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    var inferredNonNull = "The compiler assumes non-null"


    fun strLength(notNull: String): Int {
        return notNull.length
    }

    fun describeString(maybeString: String?) {
        if (maybeString != null && maybeString.length > 0) {
            println("String of length ${maybeString.length}")
        } else {
            println("Empty or null string")
        }
    }

    strLength(neverNull)
    println(strLength(inferredNonNull))

    println(neverNull)
    println(nullable)
    println(inferredNonNull)

    describeString("Hello ms")
    describeString("")
    describeString(null)


}