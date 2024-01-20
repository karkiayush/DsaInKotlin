package stack

import java.util.*

/**
 * Challenge 1: Reverse a LinkedList
 * Given a linked list, print the nodes in reverse order. You should not use recursion to
 * solve this problem.
 *
 *
 * Challenge 2: The parentheses validation
 * Check for balanced parentheses. Given a string, check if there are ( and ) characters,
 * and return true if the parentheses in the string are balanced. For example:
 * // 1
 * h((e))llo(world)() // balanced parentheses
 * // 2
 * (hello world // unbalanced parentheses
 * */


fun main() {
    println("Enter the input for needed for the string validation: ")
    val userInput = readlnOrNull()

    val result = validateParenthesis(userInput)
    if (result) {
        println("Yes the parenthesis is balanced")
    } else {
        println("No, The parenthesis is not balanced")
    }
}

fun validateParenthesis(userInput: String?): Boolean {
    /**If we use the arrayListOf, then we need to custom define the push(), pop() and all other methods*/
    val parenthesisStorage = Stack<Char>()
    for (char in userInput.orEmpty()) {
        when (char) {
            '(' -> {
                parenthesisStorage.push(char)
            }

            ')' -> {
                if (parenthesisStorage.isEmpty()) {
                    return false
                } else {
                    /**parenthesis.pop() pops out the top most parenthesis and if turns out to be ')' then return
                     * boolean is true else false*/
                    parenthesisStorage.pop()
                }
            }
        }
    }
    return !parenthesisStorage.isEmpty()
}
