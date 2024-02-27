//Exemplo de variável em Kotlin

// fun main() {

//     val nome = "Danilo" // Variavel tipo string // pode ser alterada
//     var idade = 19 // Variavel do tipo inteiro // não pode ser alterada
//     println("Nome: $nome, Idade: $idade")     // imprimindo o conteúdo da variável no console

// }

//Declaração e Inicialização de Variáveis
//Int, Double, String, Boolean - Mais uilizados

fun main () {

    val numeroInteiro: Int = 10
    var numeroDecimal: Double = 3.14
    val texto: String = "Olá Mundo!"
    var status: Boolean = true //se true o status é on-line, se falso status é off-line (0 ou 1)

    println("Número inteiro: $numeroInteiro")
    println("Número Decimal: $numeroDecimal")
    println("Texto: $texto")
    println("Status: $status")
}