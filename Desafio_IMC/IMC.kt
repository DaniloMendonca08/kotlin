
import java.util.Scanner

fun coletarDados() {
     val scannerInput = Scanner(System.`in`)

     println("Seja bem vindo ao cálculo de IMC")

     println("Digite o seu peso: ")
     val peso = scannerInput.nextDouble()

     println("Digite a sua altura: ")
     val altura = scannerInput.nextDouble()

     val calculoIMC = peso / (altura * altura)

     val categoria = when {
          calculoIMC < 18.5 -> "Excesso de Magreza"
          18.5 <= calculoIMC > 25  ->
     }


}