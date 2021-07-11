const val PI = 3.14159

fun main() {
	val r :Double = readLine()!!.toDouble()
	val area = (PI * Math.pow(r, 2.0));

	println("A=%.4f".format(area))
}