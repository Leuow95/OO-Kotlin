package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal


fun main() {
    val leonardo = Pessoa(nome = "Leonardo Maia", cpf = "2345678")
    println(leonardo.nome)
    println(leonardo.cpf)

    val joao = Funcionario(nome = "Leonardo Maia", cpf = "12345678", salario = BigDecimal.valueOf(2000.0) )
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}