package xyz.fabiano.kotlin

/**
 * O ponto de partida de um programa Kotlin, assim como no Java, é uma função pública main.
 *  Embora a assinatura do método seja diferente, elas são equivalentes.
 *
 *  Note que essa função não é estática. No Kotlin não existe o conceito de função estática
 *
 *  O valor de args, assim como no Java, são os valores passados como argumentos na linha de comando.
 *
 *  Desde o Kotlin 1.3, temos a opção de receber nenhum argumento, simplesmente "fun main() {}"
 */
fun main(args: Array<String>) {

    /*
        Semelhante ao Java, temos comentários  com '//' ou '/**/'
     */
    // A função que imprime na saída padrão é semelhante, embora mais simples
    println("Hello World!")

    /*
        Podemos declarar variáveis com as palavras "var" ou "val":
    */
    val value = 10 // we cannot later reassign fooVal to something else
    var variavel = 10

    variavel = 20 // Podemos atribuir outro valor para um "var"
    /*
        Enquanto uma variável declarada como "var" pode ter outro valor atribuído, uma declarada com "val" não pode
            - "val" segue os princípios de imutabilidade tão fundamentais para a programação funcional.
            - Vale sempre dar preferência à declarações com "val" quando possível.
     */


    /*
        Na maioria dos casos, o Kotlin consegue determinar qual o tipo da sua variável sem declaração explícita.
        Portanto, valA e valB são equivalentes:
    */
    val valA: Int = 7
    val valB = 7
}