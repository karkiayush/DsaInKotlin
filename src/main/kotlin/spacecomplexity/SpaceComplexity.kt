package spacecomplexity

/**Time complexity is not only the measuring parameter for the efficiency of algorithm. Space complexity is also the
 * key factor that determine algorithmic performance*/

fun printSortedEasily(numbers: IntArray) {
    val sorted = numbers.sorted()
    for (element in sorted) {
        print("$element\t")
    }
    println()
}

/**Here the function creates the sorted copy from the provided list. So the space complexity is O(n) as it  need to
 * have the same number of element in the sorted list.
 * */

fun printSorted(numbers: IntArray) {
    // 1
    if (numbers.isEmpty()) return
    // 2
    var currentCount = 0
    var minValue = Int.MIN_VALUE
    // 3
    for (value in numbers) {
        if (value == minValue) {
            print("$value\t")
            currentCount += 1
        }
    }
    while (currentCount < numbers.size) {
        // 4
        var currentValue = numbers.max()
        for (value in numbers) {
            if (value in (minValue + 1)..<currentValue) {
                currentValue = value
            }
        }
        // 5
        for (value in numbers) {
            if (value == currentValue) {
                print("$value\t")
                currentCount += 1
            }
        }
        // 6
        minValue = currentValue
    }
}


fun main() {
    val input = intArrayOf(10, 9, 7, 2, 1, 24)
    print("Sorted array with high space complexity: ")
    printSortedEasily(input)
    print("Sorted array with low space complexity: ")
    printSorted(input)
}