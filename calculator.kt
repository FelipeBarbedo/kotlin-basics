fun main() {
	println("Escreva sua operação na forma: Numero, Operacao, Numero")
	println("Exemplo: 10 1 10 (Corresponte a: 10 + 10)")
	println()

	println("1 - Soma")
	println("2 - Subtracao")
	println("3 - Multiplicacao")
	println("4 - Divisao")

	val operatorOne :Double = readLine()!!.toDouble()
	val option :Int = readLine()!!.toInt()
	val operatorTwo :Double = readLine()!!.toDouble()
	
	when (option){
		1 		-> {println("${operatorOne} + ${operatorTwo} = ${operatorOne + operatorTwo}")}
		2 		-> {println("${operatorOne} - ${operatorTwo} = ${operatorOne - operatorTwo}")}
		3 		-> {println("${operatorOne} * ${operatorTwo} = ${operatorOne * operatorTwo}")}
		4 		-> {println("${operatorOne} / ${operatorTwo} = ${operatorOne / operatorTwo}")}
		else	-> {println("Erro!")}
	}
}