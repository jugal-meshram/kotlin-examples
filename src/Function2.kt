
fun main(args: Array<String>) {
    val (two, three) = nextTwo(1)
    println("1 $two $three")
}

fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}