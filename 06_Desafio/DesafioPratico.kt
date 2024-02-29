fun main () {

    var qtdCoxinhas = 3
    var qtdCervejas = 2
    var precoCoxinha = 5.00
    var precoCerveja = 15.00
    
    var somaCoxinha = precoCoxinha * qtdCoxinhas
    var somaCerveja = precoCerveja * qtdCervejas

    var somaProdutos = somaCerveja + somaCoxinha
    var taxa = somaProdutos * 0.10
    var total = somaProdutos + taxa

    println("--------------------------------------------")
    println(".: Lanchonete Vinny :.")
    println("--------------------------------------------")
    println("$qtdCoxinhas coxinhas      R$ $somaCoxinha")
    println("$qtdCervejas cervejas      R$ $somaCerveja")
    println("Somatória      R$ $somaProdutos")
    println("Taxa 10%                   R$ $taxa")
    println("--------------------------------------------")
    println("Conta final                R$ $total")

    
}