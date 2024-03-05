//Exercicio de verificação de acesso

// fun main () {

//     val usuario = "vinicius" //Usuario que deseja realizar o login
//     val senha = "senha123" //Senha pré-definida

//     //verificando se o usuário é válido
//     if (usuario == "vinicius" && senha =="senha123") {

//         println("Acesso permitido")

//     } else {

//         println("Usuário ou Senha inválido")
//     }
// }

fun main () {

    println("Digite um nome de usuário: ")
    val usuario = readLine()

    println("Digite uma senha")
    val senha = readLine()

    println("Fazendo login...")
    
    println()

    println("Digite o usuário cadastrado: ")
    val usuarioLogin = readLine()

    println("Digite a senha cadastrada: ")
    val senhaLogin = readLine()

    if (usuario == usuarioLogin && senha == senhaLogin) {
        
        println("Usuário autenticado com sucesso")
    
    } else {
        
        println("Usuário ou senha incorretos")
    }
}