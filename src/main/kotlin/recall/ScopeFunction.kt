package recall/*
Kotlin Scope Functions
1. let
2. run
3. with
4. apply
5. also

To make our work easy, ksl has many functions to form a temporary scope.

Scope functions are the utility functions that are used commonly used.


* */

fun main() {
    /*apply function*/
    val emp = Employee()
    /* emp.name="Steven"
     emp.age=22*/
    /*with the use of apply function, we can save some keystrokes as it creates the reference of that data class*/

    /*Imp: return type will be the obj of data class type*/
    var ret = emp.apply {
        /*apply simply creates a scope of that data class whose properties can be accessed directly*/
        name = "Saun"
        age = 22
        println(name)
    }
    println(ret.age)
    println(emp.name)


    /*let function*/
    /*Note: return value of scope will be the return value of last line of let block*/
    val x = emp.let {
        println(it.name)
        println(it.age)
        //since the last line doesn't return any value, it just simply prints the age, so the return type of the let
        // block will be unit
    }::class

    println("Return type of let block: ${x.simpleName}")

    val a = with(emp) {
        name = "Khwaja"
        age = 36
        println("\nHis name is $name & he is $age years old")
    }::class

    /*return type of with is type of last statement of with block. with perform same as apply in terms of variable
    accessing and return nature is same as of let*/
    println(a.simpleName)
}

data class Employee(var name: String? = null, var age: Int? = null)