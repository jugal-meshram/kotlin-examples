fun main(args: Array<String>) {
    println("1+2+3+4+5=${add(1, 2, 3, 4, 5)}")
}

fun add(vararg nums: Int): Int {
    var sum: Int = 0
    nums.forEach { sum += it }
    return sum
}


