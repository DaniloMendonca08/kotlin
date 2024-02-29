//Exercicio 3: Média dos elementos 

fun main () {

    val values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0) //Array de double
    var sum = 0.0 //variavel para armazenar a soma

    //Loop para somar os elementos de Array

    for (value in values) {
        sum += value
    }
        val average = sum / values.size //calculo da média
        println("A média é $average") //impressão da média
}