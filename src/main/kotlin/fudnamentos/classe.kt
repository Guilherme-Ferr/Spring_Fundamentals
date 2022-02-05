package fudnamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessao. Nome: ${nome}, Idade: ${idade}"
    }

}

fun main(){
    var gustavo = Pessoa("Gustavo", 24)
    println(gustavo)

}
