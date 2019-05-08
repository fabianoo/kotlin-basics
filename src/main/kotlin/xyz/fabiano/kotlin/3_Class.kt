package xyz.fabiano.kotlin

import java.lang.Error
import java.lang.RuntimeException

/*
    Parece familiar?
 */
class MyFirstClass {
    private val test = "Fera"

    fun printTest() {
        println(test)
    }
}

/*
    E agora?
 */
class JustAnotherClass(
    val errorMessage: String,
    private val hiddenError: Throwable,
    private var mutableString: String,
    val aConstructorAttr: Int
) : RuntimeException() {

    private val justAClassVal = 42

    var formattedTimes = 0

    companion object {
        const val CONSTANT = "Esta é uma constante como no Java :O"

        fun constructDefault() : JustAnotherClass {
            return JustAnotherClass("Mensagem de erro", Error(), "Mutable String", 3)
        }
    }

    fun formatMessage(subject : Any) : String {
        formattedTimes++
        return "$errorMessage: $subject"
    }
}


/*
    Cadê os varargs???
 */
fun printEveryChar(vararg chars: Char) {
    chars.forEach { println(it) }
}

fun main() {
    val myFirstClass = MyFirstClass()
    myFirstClass.printTest()

    println("Constante: ${JustAnotherClass.CONSTANT}")

    /*
        Mas "val" já é um valor imutável, pq diabos preciso da palavra chave "const"?
            - Por mais que um "val" seja imutável, ele não é uma constante no tempo de compilação, apenas em Runtime.
            Já a palavra chave "const" indica que aquele valor deve ser uma constante em tempo de compilação,
            jamais tendo seu valor dinâmico.
     */

    val antoherClass = JustAnotherClass.constructDefault()

    println(antoherClass.formatMessage(5))
    println(antoherClass.formatMessage("Ahhhhhhh!!!"))
    println("Formatamos mensagens ${antoherClass.formattedTimes} nesta instância!")

    printEveryChar()
    printEveryChar('a')
    printEveryChar('a', 'b', 'c', 'd', 'e', 'f')
}