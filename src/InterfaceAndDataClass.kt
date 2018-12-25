interface Person{
    val age:Int
    val name:String

    fun hasResponsibilities():Boolean
}

data class Adult(override val age:Int,override val name:String):Person{
   override  fun hasResponsibilities():Boolean =true
}

data class Child(override val age: Int, override val name: String):Person{
    override fun hasResponsibilities(): Boolean =false
}

fun display(person:Person)= when (person) {
    is Adult -> println("Adult is ${person.name}")
    is Child -> println("Child is ${person.name}")
    else -> println("Hi")


    }


fun main(args: Array<String>) {
    val adult = Adult(25,"Jugal")
    val child = Child(7,"Soham")
    display(adult)
    display(child)



}


