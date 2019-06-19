package maquinaExpendedora.principal

object Principal {

  def main (args: Array[String]):Unit= {

    def obtenerAquarius(me:MaquinaAquarius) : (MaquinaAquarius, Aquarius) = {
      if (me.latas > 0 ) (MaquinaAquarius(me.latas -1, me.monedas + 1), new Aquarius)
      else throw new RuntimeException("sin latas")
    }

    val me = MaquinaAquarius(10)

    val (me2, lata1) = obtenerAquarius(me)
    val (me3, lata2) = obtenerAquarius(me2)
  }

}
case class MaquinaAquarius(latas:Int,monedas:Int=0)
class Aquarius
