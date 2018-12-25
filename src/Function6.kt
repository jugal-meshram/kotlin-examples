fun main(args: Array<String>) {
    var ints = 1..5
    val reduce = ints.reduce { x, y -> x + y }
    val fold=ints.fold(5) {x,y->x+y}
    println("reduce=$reduce")
    println("fold=$fold")



}