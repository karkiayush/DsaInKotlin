package OOP

fun main() {
    val modResult = { a: Int -> a % 2 == 0 }
    print(modResult(4))

    val addition = higherOrderUsingLambda(1.1, 2.2, { a: Double, b: Double -> a + b })
    println("\n$addition")
}

fun higherOrderUsingLambda(a: Double, b: Double, fn: (Double, Double) -> Double): Double {
    return fn(a, b)
}