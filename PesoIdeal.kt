//Cálculo de peso ideal.

fun main(){

    println("Digite sua altura: ")
    val altura = readln().toFloat()

    println("Digite M se for mulher ou H se for Homem")
    val sexo = readln()

    if(sexo=="H"){
        val pesoIdeal = (72.7 * altura) - 58
        println("O peso ideal é $pesoIdeal")
    } else if(sexo=="M"){
        val pesoIdeal = (62.1 * altura) - 44.7
        println("O peso ideal é $pesoIdeal")
    } else{
        println("Dados invalidos")
    }
}
