package timecomplexity

/**
 * Logarithmic time complexity, denoted as O(log n), is a measure of the efficiency of an algorithm based on the logarithm of the input size. In logarithmic time complexity, the algorithm's running time grows in proportion to the logarithm of the input size. Unlike linear or quadratic time complexities, where the running time grows linearly or quadratically with the input size, logarithmic time complexity indicates that the running time grows at a slower rate.
 *
 * Logarithmic time complexity is often associated with algorithms that divide the problem into smaller problems in each step. The most common example is the binary search algorithm, where the input data is repeatedly divided into halves until the desired value is found or the search space is reduced to zero.
 *
 * Here's a simple Kotlin program demonstrating logarithmic time complexity using binary search:
 * */

fun binarySearch(arr: IntArray, target: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high) {
        val mid = (low + high) / 2

        when {
            arr[mid] == target -> return mid // Target found
            arr[mid] < target -> low = mid + 1 // Discard the left half
            else -> high = mid - 1 // Discard the right half
        }
    }

    return -1 // Target not found
}

fun main() {
    val sortedArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val target = 8

    val result = binarySearch(sortedArray, target)

    if (result != -1) {
        println("Element $target found at index $result.")
    } else {
        println("Element $target not found in the array.")
    }
}

/**In the binary search algorithm, the search space is repeatedly halved with each comparison, leading to a logarithmic time complexity. The algorithm efficiently narrows down the search range by dividing it in half at each step, making it more efficient for large datasets compared to linear search algorithms.*/
