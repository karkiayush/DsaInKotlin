package stack

/**Our stack can hold any type of element*/
interface OurStack<T : Any> {
    fun push(element: T)

    /**As pop func removes the top most element which can be of any type.
     *
     * As the stack can be null sometime, so we need to make the pop function nullable by adding the ?*/
    fun pop(): T?
}