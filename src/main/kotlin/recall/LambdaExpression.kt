package recall/*Lambdas and Lambdas Expression*/


/*Different variation of lambdas*/

fun main() {
    val a = 22
    val b = 20
    var fn: (a: Int, b: Int) -> Int = ::add

}

fun add(a: Int, b: Int): Int {
    return a + b
}


fun calculator1(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}