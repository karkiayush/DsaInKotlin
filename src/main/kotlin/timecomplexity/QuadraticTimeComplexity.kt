package timecomplexity

/**It is the type of time complexity where the time takes by the algorithm is proportional to the input size. It is
 * commonly referred as "n squared" algo.*/

fun main() {
    val arraySize = 5
    val array = IntArray(arraySize) { it + 1 } // Creating an array [1, 2, 3, 4, 5]

    println("Quadratic Time Complexity Example:")

    // Nested loop resulting in quadratic time complexity O(n^2)
    for (i in array) {
        /**For the first outer for loop, the loop runs for n iteration, where n is the size of the array*/
        for (j in array) {
            /**Also for the internal for loop, the loop runs for n iteration.
             *
             * Hence overall the time complexity is n^2*/
            println("($i, $j)")
        }
    }
}
