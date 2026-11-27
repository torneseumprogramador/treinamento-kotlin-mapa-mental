
fun main() {
	class Retangulo(val largura: Int, val altura: Int) {
        val area: Int 
            get() = largura * altura // propriedade que já devolve calculada
    }

    val r = Retangulo(10, 20)
    println("Área: ${r.area}")
}