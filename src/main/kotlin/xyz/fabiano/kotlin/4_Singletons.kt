package xyz.fabiano.kotlin

object SingletonClass {

    private var callCount = 0

    private val returnedPhrases = mutableListOf<Int>()

    private val motivationalPhrases = arrayOf(
        "A motivação não é a fórmula mágica para atingir o sucesso, mas certamente garante o caminho mais rápido para o alcançar.",
        "Não procure ser o melhor, mas sim o mais simples. Porque até a maior árvore da floresta começa do chão.",
        "Se você cansar, aprenda a descansar e não a desistir.",
        "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente."
    )

    fun getAMotivationalPhrase(): String {
        // Incrementa a contagem, reatribuindo um valor (por isso, essa variável é um "var")
        ++callCount

        // Um simples Range e um random gerado deste>
        val randomIndex = (1..motivationalPhrases.size).random() - 1

        /*
            Esta variável é um "val", imutável portanto, certo? Não, ele pode ser mudado, só não pode ser reatribuído.
            No caso de listas, é comum precisarmos que uma determinada lista possa ser alterada, para isso,
            usamos as MutableList. O List no Kotlin, por default, é imutável.
         */
        returnedPhrases.add(randomIndex)

        return motivationalPhrases[randomIndex]
    }

    fun whichPhrasesWasCalled() : List<Int> {
        return returnedPhrases
    }

    fun howManyTimeWasICalled() : Int {
        return callCount
    }

}

fun main() {

    /*
        Quero uma frase motivacional do nosso Singleton:
     */
    val phrase = SingletonClass.getAMotivationalPhrase()
    println(phrase)

    /*
        Mais?
     */
    println(SingletonClass.getAMotivationalPhrase())
    println(SingletonClass.getAMotivationalPhrase())

    println("Quantas vezes eu te chamei?")
    println("Você me chamou ${SingletonClass.howManyTimeWasICalled()} vezes")

    println("E quais frases você me retornou?")
    println("Retornei as frases nos índices: ${SingletonClass.whichPhrasesWasCalled()}")
}