package one.digitalInnovation.rafabank

class Pessoa {
    var nome: String = "Teste"
    var cpf: String = "123.456.789-01"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main(){
    val teste = Pessoa()

    print("Nome: ${teste.nome} - CPF: ${teste.cpf}")
}
