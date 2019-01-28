fun main(args: Array<String>) {

    //Pierwszy program
//    fun printHello(name: String?): Unit {
//        if (name != null) {
//            println("Hello $name")
//        }
//    }
//    printHello("Dawid")

    //Drugi program
//    fun double(x: Int) = x * 2
//    println(double(2))

    //Trzeci program
    val num = 10
    val s = "i = $num "

    //Czwarty program
    var a: String? = "abc"
    a = null
    var b:String = "bcd"

    a?.equals(b) ?: (b === null)

}
