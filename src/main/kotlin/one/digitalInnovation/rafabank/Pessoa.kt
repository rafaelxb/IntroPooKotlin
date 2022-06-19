package one.digitalInnovation.rafabank

class Pessoa {
    var nome: String = "Teste"
    var cpf: String = "123.456.789-01"
    private set

    constructor()

    fun infoPessoa() = "Nome: ${nome} - CPF: ${cpf}"

}

fun main(){
    val test = Pessoa()

    print(test.infoPessoa())
}
