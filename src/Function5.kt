

fun main(args: Array<String>) {
var mult3=makeMathFunc(3)
    println("3*4=${mult3(4)}")
}

fun makeMathFunc(num1:Int):(Int)->Int={num2->num1*num2}

//fun makeMathFunc1(num1:Int):(num2:Int)->((num3:Int)->Int)={num2 ->((num1*num2) ->) }

//fun makeMathFunc2(num1:Int): fun(num2:Int){num2*fun()}