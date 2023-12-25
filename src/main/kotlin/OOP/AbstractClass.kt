package OOP

import com.sun.org.apache.xalan.internal.lib.ExsltMath.power

fun main() {
    val circle = Circle(2.0)
    circle.calcArea()
}

abstract class Shape {
    var name: String = ""
    abstract fun calcArea(): Double
    open fun display() = println("Shape is getting narrower than it was initially")
}

class Circle(val rad: Double) : Shape() {
    override fun calcArea(): Double {
        println("The area of ciricle is: ${Math.PI * power(rad, 2.0)}")
        return Math.PI * power(rad, 2.0)
    }
}