package OOP

/*
* Notice, the keyword open before the base class, Person. It's important.
By default, classes in Kotlin are final. If you are familiar with Java, you know that a final
class cannot be subclassed. By using the open annotation on a class, compiler allows you
to derive new classes from it.
* */
// Base class
open class PersonMan(val name: String, val age: Int) {
    // Method in the base class
    open fun introduce() {
        println("Hello, my name is $name and I'm $age years old.")
    }
}

// Derived class
class Student(name: String, age: Int, val studentId: String) : PersonMan(name, age) {
    // Additional property specific to Student
    var grade: Int = 0

    // Overriding the introduce method from the base class
    override fun introduce() {
        println("Hello, I'm a student named $name, $age years old, with student ID $studentId.")
    }

    // Additional method specific to Student
    fun study() {
        println("$name is studying.")
    }
}

fun main() {
    // Creating an instance of the base class
    val person = PersonMan("John", 25)
    person.introduce()

    // Creating an instance of the derived class
    val student = Student("Alice", 20, "S12345")
    student.grade = 90
    student.introduce()
    student.study()
}
