package one.digitalInnovation.rafabank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info(): String {
        return ("${nome} - ${numero}")
    }
}



