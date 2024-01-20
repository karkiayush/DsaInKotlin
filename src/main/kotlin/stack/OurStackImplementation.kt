package stack

/**Since the OurStack interface support elements of any type, the class that implements the OurStack interface also
 * need to support elements of any type*/
class OurStackImplementation<T : Any> : OurStack<T> {
    /**For that data storage, we are going to use the array list*/
    private val dataStorage = arrayListOf<T>()

    override fun toString() = buildString {
        if (dataStorage.size != 0) {
            appendLine("<=========TOP==========>")
            dataStorage.reversed().forEach {
                appendLine("$it")
            }
            appendLine("=========================")
        } else {
            appendLine("Stack is totally empty")
        }
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

    override fun getSize(): Int {
        return dataStorage.size
    }

    override fun getTopElement(): T? {
        return if (dataStorage.size != 0) {
            dataStorage[dataStorage.size - 1]
        } else {
            null
        }
    }

    override fun isStackEmpty(): String {
        return if (dataStorage.size == 0) {
            "The stack is empty"
        } else {
            "The stack is not empty"
        }
    }

}