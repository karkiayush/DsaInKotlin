package stack

/**Since the OurStack interface support elements of any type, the class that implements the OurStack interface also
 * need to support elements of any type*/
class OurStackImplementation<T : Any> : OurStack<T> {
    /**For that data storage, we are going to use the array list*/
    private val dataStorage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("--------Top-----------")
        dataStorage.reversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------------------")
    }

    override fun push(element: T) {
        dataStorage.add(element)
    }

    override fun pop(): T? {
        return if (dataStorage.size == 0) {
            null
        } else {
            val topIndex = dataStorage.size - 1
            dataStorage.removeAt(topIndex)
        }
    }
}