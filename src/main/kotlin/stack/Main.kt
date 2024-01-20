package stack

/**
 * Stack is a Last-In-First-Out (LIFO) data structure. Elements are added and removed from the same end, known as the
 * top. Common operations include push (add an element to the top) and pop (remove the top element).
 *
 * some of the operation that we gonna do with the stack is:
 * a> add item to the stack(push)
 * b> remove item from the stack(pop)
 * c> get size of the stack
 * d> retrieve the top element of the stack
 * e> check if the stack is empty or full
 *
 * firstly we create an interface
 * */
fun main() {
    var ourStackImpl = OurStackImplementation<Int>()

    ourStackImpl.push(33)
    ourStackImpl.push(22)
    ourStackImpl.push(11)
    ourStackImpl.push(0)
    println(ourStackImpl)

    ourStackImpl.pop()

    println(ourStackImpl)
    println("size of stack: ${ourStackImpl.getSize()}")
    println("Top element of stack: ${ourStackImpl.getTopElement()}")
    println("${ourStackImpl.isStackEmpty()}\n")


    ourStackImpl.pop()
    ourStackImpl.pop()
    ourStackImpl.pop()

    /**Checking the stack after popping out all the elements*/

    println(ourStackImpl)
    println("size of stack: ${ourStackImpl.getSize()}")
    println("Top element of stack: ${ourStackImpl.getTopElement()}")
    println(ourStackImpl.isStackEmpty())
}
