package timecomplexity

/**
 *Quasilinear Time complexity performs worse than the linear time complexity but is better than the Quadratic time
 * complexity.
 * Kotlin sort() method is the example of quasilinear time complexity. So quasilinear fits between logarithmic
 * and linear time.
 *
 * The big O notation of Quasilinear Time Complexity is: O(n log n)
 *
 * The time complexity of Merge sort algo is quasilinear time complexity
 * */

fun mergeSort(arr: IntArray): IntArray {
    if (arr.size <= 1) {
        return arr
    }

    val middle = arr.size / 2
    val left = arr.sliceArray(0..<middle)
    val right = arr.sliceArray(middle..<arr.size)

    return merge(mergeSort(left), mergeSort(right))
}

fun merge(left: IntArray, right: IntArray): IntArray {
    var i = 0
    var j = 0
    var k = 0
    val result = IntArray(left.size + right.size)

    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) {
            result[k++] = left[i++]
        } else {
            result[k++] = right[j++]
        }
    }

    while (i < left.size) {
        result[k++] = left[i++]
    }

    while (j < right.size) {
        result[k++] = right[j++]
    }

    return result
}

fun main() {
    val unsortedArray = intArrayOf(4, 2, 8, 1, 6)
    val sortedArray = mergeSort(unsortedArray)

    println(sortedArray.joinToString())
}
