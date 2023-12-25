import kotlin.math.pow

/*Since kotlin is multi-paradigm programming language, it supports both the function programming and object oriented
programming*/

/*Kotlin Higher order functions
*  It can be defined as that type of functions that accepts functions as argument or returns functions or both
* */


/*Function types*/

fun main() {
    println(sum(1.1, 2.2))
    println(power(2.0, 4.0))

    /*we can store the function inside of the variable in kotlin*/
    /*functions are the first class citizen in kotlin like the way we give the importance to the objects*/
    var fn = ::sum
    println(fn(1.0, 1.1))

    calculator(2.1, 3.2, fn)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}


/*Higher order functions*/
fun calculator(
    a: Double,
    b: Double,
    /*syntax:
    * functionName: (input argument type)-> return type*/
    /*here func: is a var name like in above i.e a, b etc and func: takes in function as input*/
    func: (Double, Double) -> Double
) {
    var result = func(a, b)
    println(result)
}