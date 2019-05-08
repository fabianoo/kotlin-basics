package xyz.fabiano.kotlin

fun main() {

    /*
        Strings são representadas como no Java. Escapamos Strings da mesma forma, com backslack "\"
        Desta mesma forma, toda a API de String do Java também se aplica no Kotlin.
    */
    val myString = "String simplona!"
    val newLineString = "Vamos imprimir uma nova linha?\nAqui está!"
    println(myString)
    println(newLineString)


    /*
        As diferenças começam aqui. No Kotlin temos Strings de muitas linhas e formatadas. Estas são delimitadas por """:
    */
    val rawString = """
        fun helloWorld(val name : String) {
           println("Hello, world!")
        }
        """
    println(rawString)

    /*
        Podemos cortar a identação da String de maneira muito simples:
     */
    val rawStringSemIdentacao = """
        fun helloWorld(val name : String) {
           println("Hello, world!")
        }
        """.trimIndent()

    println(rawStringSemIdentacao)

    /*
        Quer definir sua sintaxe para margens?
     */
    val marginString = """
        !!! fun helloWorld(val name : String) {
!!!     println("Hello, world!")
            !!!}
        """.trimMargin("!!! ")
    println(marginString)

    /*
        Concatenação de Strings no Kotlin pode ser muito mais bonito ;)
        Para isso, podemos usar o template expression, que começam com "$"

        Vale notar as 2 formas: Com e sem chaves "{}".
        Com chaves, podemos atribuir uma expressão de valor, por exemplo, uma função
    */
    val templateString = "$myString has ${myString.length} characters"
    println(templateString)

    /*
        Quer acessar um índice da String?
     */
    println(myString[5])

    /*
        Quer iterar sobre todos os chars da String?
     */
    for(char in myString) println(char)
}