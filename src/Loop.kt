fun main(args: Array<String>) {
    for(i in 1..10) {
        println("for loop: $i")
    }
    println()

    val arr = arrayOf(1,4,8)

    for(i in arr.indices){
        println("index:$i")
    }
    println()
    for(i in arr){
        println("value:$i")
    }
    println()
    for((x,y) in arr.withIndex()){
        println("index is $x, value is $y")
    }
}