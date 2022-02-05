package fudnamentos

fun main(){

    //Nao recebe valores duplicados
    var setNumero = setOf(1,2,3)

    //Associar chaves e valores
    var mapNomes = mapOf("daniel" to 20, "gustavo" to 24)


    //Associar chaves e valores
    var mapIdades = mutableMapOf("daniel" to 20, "gustavo" to 24)

    //adicionar
    mapIdades.put("guilherme", 22)

    //remover
    mapIdades.remove("daniel")

    //colocar se nao existir
    mapIdades.putIfAbsent("bla", 22)

//    //Lista nao mutavel -> listOf
//    var lista = listOf(1,2,3,4,5,6)
//
//
//    //Lista mutavel -> listOf
//    var listaMutavel = mutableListOf(1,2,3)
//
//    println(listaMutavel)
//
//    listaMutavel.add(8)
//
//    println(listaMutavel)
//
//    //Ordem alfabetica crescente
//    listaMutavel.sort()
//
//    //Embaralhar
//    listaMutavel.shuffle()
//
//    listaMutavel.removeAt(0)
//    listaMutavel.remove(4)




//    listaMutavel[3] = 69

    //contem isso dentro da lista
//    println(listaMutavel.contains(2))

    // IT = index

//    var pares = lista.filter { it % 2 == 0 }.first() //primeiro valor da lista    .last() -> ultimo valor

//    for (numero in lista){
//        println(numero)
//        println(lista.size)
//        println(lista.indexOf(2))
//    }


}