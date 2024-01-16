package oop

/*OOp which stands for the object oriented programming is the paradigm that allows us to solve the programming
problems related it with the real world entities*/

/*Classes are the blue print or the collection of properties and functions
*
* Whereas Objects are the real thing or instance of the class that their creation in the program helps to interact
* with all the other objects to complete the task
* */

fun main() {
    val co = ClassesObjects("Jessy", 20, 45.55)
    co.greet()
}

class ClassesObjects(val name: String, val age: Int, val marksObtained: Double) {
    init {
        if (age < 18) {
            println("You are under age. So I'm not gonna touch you")
        } else {
            println("You are not under age girls. So I must be comfortable with you")
        }

    }

    fun greet() {
        if (age > 12)
            println("Hello $name, Good Morning")
        else
            println("Good morning $name sweety. How are you ?")
    }

}


/*
1. Classes & Objects in Kotlin
2. Constructors in Kotlin
3. Kotlin - Getters and Setters
4. Inheritance in Kotlin
5. Kotlin Visibility Modifiers
*/
