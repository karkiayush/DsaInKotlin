package OOP

/*
* A constructors is a concise way to initialize class props.
*
* It's a special member function that is called when an object is instantiated/created. However, how they work in kotlin is slightly different
*
* There are 2 constructors in kt:
* 1. Primary constructor: concise way to initialize a class.
* 2. Secondary constructor: allows you to put additional initialization logic
* */

/*Demo of primary constructor*/
class Person(val fName: String, var age: Int)
/*Primary constructor is the part of the class header as you can see above*/

fun main() {
    val person = Person("Steven", 33)

    println("Hello ${person.fName}, are you ${person.age} years old?")

    val kt = Kotlin("JetBrains", "Mobile Application Development")
    kt.kotlinInfo()

    val gl = GitLog("12:12 AM")
    val gl1 = GitLog("1:12 PM", "Stable version is pushed to server")
}

/*PRIMARY CONSTRUCTOR AND INITIALIZER BLOCK

As we know the primary constructor have the constrained syntax and doesn't give that much flexibility to work around
it. Thus we have provided with the initialized block init{} that automatically gets invoked when the object creation
happens, where the different task can be done like initializing the props of the class and other task like function
invocation etc

**/
class Kotlin(developedBy: String, mainApplicationArea: String) {
    var developingCompany: String? = null
    var mainlyUsedFor: String? = null

    init {
        developingCompany = developedBy
        mainlyUsedFor = mainApplicationArea
    }

    fun kotlinInfo() {
        println(
            "Kotlin is general purpose multi-paradigm programming language developed by $developingCompany and is " +
                    "mainly used for $mainlyUsedFor"
        )
    }
}


/*SECONDARY CONSTRUCTORS
* In kotlin, a class can also contain one or more secondary constructors using the "constructor" keyword.
*
* They are not commonly used in kotlin.
* The most common use of secondary constructors comes up when you need to extend a class that provide multiple
* constructors that initialize the class in different ways.
* */

class GitLog {
    var printMessage: String = "The lastest commit was done at time of "
    constructor(latestCommit: String) {
        println(printMessage + latestCommit)
    }
    constructor(latestCommit: String, latestCommitMsg: String) {
        println("\n$printMessage  $latestCommit where the commit message was $latestCommitMsg")
    }
}

