class Adestrador {

    /*
     *Creamos las variables y le damos un valor
     */
    var id: Int = 34
    var nome: String = "Juan"
    var apelido: String = "Arribas"
    var edade: Int = 65
    var idFederacion: String = "6546"

    /*
     * Creamos un construtor con los paramtros
     */
    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
        this.idFederacion = idFederacion
    }

    /*
    * metodo concentrarse que recibe un int y devuelve otro int
     */
    fun concentrarse(tiempoConcentracion: Int): Int = tiempoConcentracion

    /*
    * metodo viaxar que recibe un int y devuelve otro int
     */

    fun viaxar(tiempoDestino: Int): Int = tiempoDestino



    fun dirixirPartido(): Unit {
        println("O adestrador $id $nome $apelido está dirixindo o partido")
    }

    fun dirixirAdestramento(): Unit {
        println("O adestradir $id $nome $apelido está dirixindo o adestramento")
    }

    /*
    * metodo toString
     */
    override fun toString(): String {
        return "Adestrador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, idFederacion='$idFederacion')"
    }

}