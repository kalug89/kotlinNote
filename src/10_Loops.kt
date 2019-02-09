fun main(args: Array<String>) {


    //1
//    val list = listOf("Domek", "Korzen", "Obora")

//    for (liter in list){
//        println(liter)
//    }

//    list.forEach{
//        println(it)
//    }

    //2
    //    repeat(10){ x ->
//        println("Jestemy na $x operacji pętli" )
//        val domek = x
//    }


    //4

//    var map = hashMapOf(1 to "domek", 2 to "stromek", 3 to "Drzewko")
//    for ((value, key) in map){
//        println("Map$value, $key")
//    }

    //5

//    var list = listOf(1, 2, 3, 4, 5, 6,7)
//    var mapList = list.map { "numerek $it" }
//    println(mapList)


    //7
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
//    val numberStrings = numbers.filter { it % 2 == 0 }.map {
//        "Number $it"
//    }

    //8
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    numbers.filter { it % 8 == 0  }.map{
        println("Numeer $it")
    }

}




