//Exemplo de variável em Kotlin

// fun main() {

//     val nome = "Danilo" // Variavel tipo string // pode ser alterada
//     var idade = 19 // Variavel do tipo inteiro // não pode ser alterada
//     println("Nome: $nome, Idade: $idade")     // imprimindo o conteúdo da variável no console

// }

//Declaração e Inicialização de Variáveis
//Int, Double, String, Boolean - Mais uilizados

// fun main () {

//     val numeroInteiro: Int = 10
//     var numeroDecimal: Double = 3.14
//     val texto: String = "Olá Mundo!"
//     var status: Boolean = true //se true o status é on-line, se falso status é off-line (0 ou 1)

//     println("Número inteiro: $numeroInteiro")
//     println("Número Decimal: $numeroDecimal")
//     println("Texto: $texto")
//     println("Status: $status")
// }


//Variáveis com tipo de dados
//Char, Byte, Short, Long

// fun main () {

//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 100000000
//     val numeroDecimal: Double = 211.14
//     val caractere: Char = 'V'
//     val texto: String = "Kotlin também serve para back end"
//     val verdadeiro: Boolean = true

//     println("Inteiro: $numeroInteiro")
//     println("Long: $numeroLong")
//     println("Decimal: $numeroDecimal")
//     println("Caractere: $caractere")
//     println("Texto: $texto")
//     println("Verdadeiro: $verdadeiro")    
// }

//Mutabilidade e Imutabilidade no contexto de VAR e VAL

// fun main () {

//     var mutavel: Int = 10 //Mutável
//     val imutavel: Int = 5 //Imutável
    
//     mutavel = 15 // ok
//     imutavel = 20 // Erro! Não pode atribuir um valor a uma variável declarada como imutável

//     println("mutável: $mutavel")
//     println("Imutável: $imutavel")

// }

//Convenções de Nomenclatura

//Exemplo de nomenclatura de variáveis

// fun main () {
//     val nomeCompleto: String = "Danilo Mendonça"
//     val idadeDoUsuario: Int = 19
//     val valorTotal: Double = 50.0 //Evite utilizar underscore em nomes de variáveis
//     val inicialNome: Char = 'D'

//     println("Nome completo: $nomeCompleto")
//     println("Idade do Usuário: $idadeDoUsuario")
//     println("Valor total: $valorTotal")
//     println("Inicial nome: $inicialNome")

// }

//Escopo de variáveis

//Exemplo

fun main () {

    val nome = "Alice"

    if (false) {
        val sobrenome = "Silva" //variável sobrenome só é visível dentro deste bloco
        println("$nome $sobrenome") //Alice Silva
    } else 
    println("Deu ruim")
    // println("$nome $sobrenome") //ERRO! A variável sobrenome não está definida nesse escopo e não é visível

}