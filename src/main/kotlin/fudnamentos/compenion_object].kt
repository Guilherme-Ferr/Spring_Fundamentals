package fudnamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object{
        fun criComValoresPAdrao(): MinhaClasse{
            return MinhaClasse("Gustavo", "Rua", 354)
        }

        fun criarAPartirDaSegunda(segundaClasse: SegundaClasse): MinhaClasse{
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }


}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criComValoresPAdrao(): SegundaClasse{
        return SegundaClasse("Gustavo", "Rua", 354)
    }
}

fun main(){
    var segundaClasse = SegundaClasse("Gustavo", "Rua", 354).criComValoresPAdrao()

    var minhaClasse = MinhaClasse.criComValoresPAdrao()
}