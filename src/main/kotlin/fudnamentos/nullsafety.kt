package fudnamentos

fun main() {

    var lista: List<Int?> = listOf(1,2,3,4)
    var listNullable: List<Int>? = null

    var name: String? = "Gui"

    var tamanho: Int = name?.length ?: 0


    var nome: String? = "Gui"

    val toShort: Short = nome!!.length.toShort()

}