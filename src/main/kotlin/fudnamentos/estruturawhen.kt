package fudnamentos

fun main(){

    val x = 5


    //switch case kkkk
    when(x) {
        5 -> println("x == 5")
        8, 420, 69 -> println("x == 8")
        9 -> {
            println("x == 9")
        }
        in 11..15 -> println("esta entre esses")
        !in 16..20 -> println("NÃO esta entre esses")
        else -> println("Nao mapeado")
    }

    when{
        comecaCOmOI(5) -> println("5")
        comecaCOmOI("carai") -> println("5 conto")
    }
}

fun comecaCOmOI(x: Any): Boolean{
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}