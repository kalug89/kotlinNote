import kotlin.math.max

fun main(args: Array<String>) {


//pierwszy program
    println("Wpisz dwie liczny")

    var (a, b) = readLine()!!.split(' ')
    println(maxOf(a, b))

    //Drugi program
    fun maxNum(a: Int, b: Int): Int {
        var max = if (a > b) {
            println("$a jest większe niż $b")
            a
        } else {
            println("$b jest większe niż $a")
            b
        }
        return max
    }
    maxNum(20, 80)
}
