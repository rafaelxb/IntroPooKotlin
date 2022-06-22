package one.digitalInnovation.rafabank.testes

import one.digitalInnovation.rafabank.Banco

fun main(){
    val digiOneBank = Banco(nome = "digiOneBank", numero = 13)

    println("Banco: ${digiOneBank.nome} - Número: ${digiOneBank.numero}")

    val banco2 = digiOneBank.copy(nome = "digiOneBankCopia")

    println("Banco: ${banco2.nome} - Número: ${banco2.numero}")

    println(banco2.info())
}