//Exercicio - Maior ou Menor de idade

// fun main () {

//     val idade = 16

//     if (idade >= 18) {
//         println("Maior de idade")
//     } else {
//         println("Menor de idade")
//     }
// }


//======================Recebendo parâmetros do usuário========================

fun main () {

    //Solicitando para o usuário digitar a sua idade
    println("Digite a sua idade: ")
    val idadeInput = readLine() //Lê a entrada do usuário como uma String

    //Verificar se a entrada da idade é nula
    if (idadeInput == null) {
        println("Entrada inválida")
        return // sai da função main se a entrada for nula
    }

    // Tenta converter a entrada de idade para um valor numérico
    val idade = idadeInput.toIntOrNull()

    //Verificar se a conversão foi sucesso ou se a entrada é inválida 
    if (idade == null) {
        println("Entrada inválida! ESTA VAZIA")
        return // sai da função main se a entrada for nula
    }

    //Verificar se a idade é maior ou igual a 18
    if (idade >= 18) {
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }

}