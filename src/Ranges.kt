fun main(args: Array<String>) {
    var intRange = 1..10
    var intRangeStepTwo = intRange step 2

    var alpha = 'A'..'Z'

    println("intRange step 2 : ${3 in intRangeStepTwo}")
    println("B in alpha: ${'B' in alpha}")


    var tenToOne = 10.downTo(1)
    for(x in tenToOne) println("tenToOne:$x")

    val tenToOneStepTwo = 10.downTo(1).step(2)
    for (x in tenToOneStepTwo)println("tenToOneStepTwo:$x")

    for(x in intRange.reversed()) println("reversed:$x")
}