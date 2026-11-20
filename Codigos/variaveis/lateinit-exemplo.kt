class Database(val url: String) {
    fun conectar() = println("Conectado em $url")
}

class App {
    lateinit var db: Database

    fun iniciar() {
        db = Database("jdbc:exemplo")
        db.conectar()
    }

    fun status() {
        if (::db.isInitialized) {
            println("DB pronto: ${db.url}")
        } else {
            println("DB ainda não iniciado")
        }
    }
}

fun main() {
    val app = App()

    app.status()   // ainda não iniciado
    app.iniciar()  // atribui o lateinit
    app.status()   // DB pronto
}
