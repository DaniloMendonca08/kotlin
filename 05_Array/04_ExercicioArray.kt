//Exercicio 4: Buscando elementos do array

fun main () {

    //Array de strings
    val names = arrayOf("Mariana", "Beatriz", "Kaue", "Lucas")
    val searchName = "Kaue" //elemento a ser buscado
    var found = false //Variavel para verificar se o elemento foi encontrado

    //Loop para verificar se o elemento esta presente

    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }

    if (found) {

        println("O nome $searchName está no array.")
    } else {
        println("$searchName não foi encontrado no array.")
    }
}