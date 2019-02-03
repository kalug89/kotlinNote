fun main(args: Array<String>) {

}

        //1
//    enum class Color(val rgb: Int){
//        RED(0xFF0000),
//        GREEN(0x00FF00),
//        BLUE(0x0000FF)
//    }

    //2

//    enum class Color {
//        RED {
//            override val rgb: Int = 0xFF0000
//        },
//        GREEN {
//            override val rbg: Int = 0x00FF00
//        },
//        BLUE {
//            override val  rbg: Int = 0x0000FF
//        }
//        ;
//
//        abstract val rgb: Int
//
//        fun colorString() = "#%06X".format(0xFFFFFF and rgb)
//    }

    //3
//    enum class Color {
//        RED, GREEN, BLUE
//    }

    //4
//    enum class Planet(var population: Int = 0) {
//        EARTH(7 * 100000000),
//        MARS();
//        override fun toString() = "$name[population=$population]"
//    }
//    println(Planet.MARS) // MARS[population=0]
//    Planet.MARS.population = 3
//    println(Planet.MARS) // MARS[population=3]

