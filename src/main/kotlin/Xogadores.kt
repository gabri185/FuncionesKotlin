class Xogadores{

    /*
     *Creamos las variables y le damos un valor
     */
    var id: Int = 62
    var nome: String = "Lionel"
    var apelido: String = "Messi"
    var edade: Int = 34
    var dorsal: Int = 10
    var demarcacion: String = "Delantero"

    /*
     * Creamos un construtor con los paramtros
     */
    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    /*
    *metodo concentrarse que recibe un int y visualiza un mensage
     */
    fun concentrarse(tiempoConcentracion: Int) {

        println("Concentrase a seleccion e o tempo" + tiempoConcentracion)
    }

    /*
    *metodo concentrarse que recibe un int y devuelve otro int
     */

    fun viaxar(tiempoDestino: Int): Int = tiempoDestino

    fun xogarPartido(): Unit {
        println("O xogador $id $nome $apelido está convocado a xogar o partido")
    }

    fun entrenar(): Unit {

        println("O xogador  $id $nome $apelido  ten pendiente un entreno")
    }
    /*
    *metodo toString
     */

    override fun toString(): String {
        return "Xogador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, dorsal=$dorsal, demarcacion='$demarcacion')"
    }

}