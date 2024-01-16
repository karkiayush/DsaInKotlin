package timecomplexity

/**A constant time algo is the one that have the same running time regardless of its input size.*/

fun main() {
    checkFirst()
}

fun checkFirst() {
    /** Here you can see that the size of the name doesn't effect the running time of the algorithm since it only
     * checks the first element of the list.
     *
     * So the time complexity is O(1)*/
    val nameList = arrayListOf("Warner", "Steven", "David")

    if (nameList.firstOrNull() == null) {
        println("Empty name list")
    } else {
        println("Name list is not empty")
    }
}
