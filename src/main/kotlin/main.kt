fun main(args: Array<String>) {
   /*
   *@author gabriel
    */

    //Instanciamos un objeto de tipo xogadores
    val xogador1 = Xogadores(1, "Leo", "Messi", 33, 10, "Delantero")
    //Instanciamos un objeto de tipo adestrador
    val adestrador1 = Adestrador(1, "Juan", "Perez", 41, "ad213K")


    // métodos
    xogador1.entrenar()
    adestrador1.dirixirAdestramento()
    adestrador1.dirixirPartido()
    xogador1.xogarPartido()




}