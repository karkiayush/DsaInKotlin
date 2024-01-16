package timecomplexity

/**Linear time complexity is the one where the time taken by the algorithm increases linearly as the input size
 * increases. The algorithm with linear time complexity is denoted by O(n) where n is the size of input.*/

fun main() {
    val names = arrayListOf<String>()
    println("Total count of student: ")
    val studentCount = readlnOrNull()?.toInt()

    for (i in 0..<studentCount!!) {
        println("Name of Student${i}: ")
        val name = readln()
        names.add(name)
    }

    println("Student names are\n")
    for (name in names) {
        println("${name}\n")
    }
}