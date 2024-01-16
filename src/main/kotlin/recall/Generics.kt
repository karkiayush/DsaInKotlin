package recall/*
* Generics is a way of generalizing our code whenever we need to manipulate and use multiple data types in same way.
*
* For example: we have a class as below for receiving, assigning to a variable and returning its value
*
*
* class IntContainer(var data: Int){
*   fun setValue(value:Int){
*       data = value
*   }
*
*   fun getValue():Int{
*       return data
*   }
* }
*
* Now if we want another class for string type that does the same work, we have to make it in same manner with same
* functionality where only the types will be different.
*
* SO this problem is solved by generics
* */

fun main() {
    val container1 = Container<Int>(22)
    println(container1.getValue())

    val stringContainer = Container<String>("Kotlin is a multi paradigm language")

    println(stringContainer.getValue())
}

class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}