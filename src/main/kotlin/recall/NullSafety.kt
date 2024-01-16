package recall

fun main() {
    var car: String?
    /*println(car.drive())*/

    /*?. is called as safe call operator and it makes the execution when it is not null*/

    /*?: is known to be Elvis Operator that is used to assign values to variables that holds the null values*/

    var gender: String? = null //nullable type

    var gender1: String?


    println(gender?.toCharArray())  /*since kotlin is null safe language, it tells you to check whether the variable is
    null or not by using the safe call operator i.e ?.

    If we don't use the safe call or non null asserted call (!!.), then we get the error as:
      =>  14:19 Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type
      String?
    */
}