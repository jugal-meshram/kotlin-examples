fun main(args: Array<String>) {
val add:(num1:Int,num2:Int)->Int={num1,num2->num1+num2}
    val sub:(num1:Int,num2:Int)->Int={num1,num2->num1-num2}
    val mul:(num1:Int,num2:Int)->Int={num1,num2->num1*num2}
    val div:(num1:Int,num2:Int)->Int={num1,num2->num1/num2}

    println("6+2=${operation(6,2,add)}")
    println("6-2=${operation(6,2,sub)}")
    println("6*2=${operation(6,2,mul)}")
    println("6/2=${operation(6,2,div)}")


}

fun operation(num1:Int,num2:Int,operate:(Int,Int)->Int):Int=operate(num1,num2)



