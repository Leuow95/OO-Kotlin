package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Leonardo"
    var cpf : String = "02572655209"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val leonardo = Pessoa()

    println(leonardo.pessoaInfo())

}
