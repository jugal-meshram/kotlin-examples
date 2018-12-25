fun main(args: Array<String>) {

    fun sum(num1:Int,num2:Int): Int = num1+num2
    println("5+3=${sum(5,3)}")
    println()

    fun sub(num1:Int=8,num2:Int=3):Int=num1-num2
    println("8-3=${sub()}")
    println("8-4=${sub(num2=4)}")
    println("10-4=${sub(num1=10,num2=4)}")
    println("12-7=${sub(12,7)}")
    println()

    fun sayHello(str:String):Unit= println("Hi $str")
    sayHello("Jugal")
}