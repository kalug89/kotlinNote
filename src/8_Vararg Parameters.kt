fun main(args: Array<String>) {


    fun myNumber(vararg numbers: Int) {
        for (number in numbers) {
            println(number)
        }
    }

    var newNumber = intArrayOf(1, 2, 3, 4, 5)
    myNumber(1, 2, *newNumber, 5, 6, 7)
}
