data class Book(var title: String, var author: String)

fun main(args: Array<String>) {
    println("Hi")
    val book = Book("a", "b")
    println(book.toString())

    var (x, y) = book
    println(x)
    println(y)

}