fun main() {
    print("Digite o valor de n (1, 2 ou 3): ")
    val n = readLine()!!.toInt()

    print("Digite o valor de a: ")
    val a = readLine()!!.toInt()

    print("Digite o valor de b: ")
    val b = readLine()!!.toInt()

    print("Digite o valor de c: ")
    val c = readLine()!!.toInt()

    val valores = listOf(a, b, c)

    when (n) {
        1 -> println("Ordem crescente: ${valores.sorted()}")
        2 -> println("Ordem decrescente: ${valores.sortedDescending()}")
        3 -> {
            val maior = valores.max()
            val menor = valores.min()
            val meio = valores.sum() - maior - menor
            println("Maior no meio: $menor $maior $meio")
        }
        else -> println("Opção inválida!")
    }
}
