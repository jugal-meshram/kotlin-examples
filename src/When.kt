fun main(args: Array<String>) {
    val age=8

    when(age){
        0,1,2,3,4->println("go to preschool.")
        5->println("go to kinder garden.")
        in 6..17->{
            val grade=age-5
            println("go to grade $grade")
        }
        else->println("go to college.")


    }
}