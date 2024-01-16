package TimeComplexity

/**Linear time complexity is the one where the time taken by the algorithm increases linearly as the input size
 * increases. The algorithm with linear time complexity is denoted by O(n) where n is the size of input.*/

fun main() {
    var names= arrayListOf<String>()
    println("Enter the names of the student")
    readlnOrNull().also { names = it }
}