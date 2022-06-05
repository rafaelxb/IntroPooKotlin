package one.digitalInnovation.rafabank

class Pessoa {
    var nome: String = "Teste"
    var cpf: String = "123.456.789-01"
}

fun main(){
    val teste = Pessoa()

    print("Nome: ${teste.nome} - CPF: ${teste.cpf}")
}
