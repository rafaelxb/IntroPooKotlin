package one.digitalInnovation.rafabank

class Pessoa {
    var nome: String = "Teste"
    var cpf: String = "123.456.789-01"
    private set

}

fun main(){
    val test = Pessoa()

    print("Nome: ${test.nome} - CPF: ${test.cpf}")
}
