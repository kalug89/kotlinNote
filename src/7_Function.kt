fun main(args: Array<String>) {

    //2
// fun sayName(name:String): String{
//        return "Twoje imię to $name"
//    }
//
    fun sayMyName(name:String) = "Twoje imię to $name"
//
//    sayName("Dawid")
//    sayMyNamee("Dawid")


    //5
data class IntListWrapper (val wrapped: List<Int>) {
    operator fun get(position: Int): Int = wrapped[position]
}
val a = IntListWrapper(listOf(1, 2, 3))
    println(a)
}

