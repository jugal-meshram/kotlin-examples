fun main(args: Array<String>) {
    print("Enter any number:")
    val nStr = readLine()!!
    val intRange = 1..nStr.toInt()
    intRange.filter {it.isPrime()}.forEach { print("$it ")}

}
fun Int.isPrime():Boolean{
    if (this==1 ) return false
    for(i in 2..this/2){
        if(this%i==0){
            return false
        }
    }
    return true
}