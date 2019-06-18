package principal

import usuario.Usuario

object Principal {

  def main (args: Array[String]):Unit= {
    val usuario = new Usuario("Juan")
    val usuario2 = new Usuario("Maria",34)
    var users =
      List (usuario,
            usuario2,
            usuario2.copy(nombre="Anna"),
            usuario2.copy(edad = 20),
            usuario2.copy("Juan",16))

    println(s"testing users: ${usuario.nombre} (${usuario.edad})")

    /*
    val younger = (usr:Usuario)=> usr.edad < 20 && usr.edad > 15
    val youngPpl = users.filter(younger)
    youngPpl.foreach(println)*/
    //Obtener menores de 20 pero mayores de 15
    def getYoungers(l:List[Usuario]) : List[Usuario] = l.filter(usr => usr.edad < 20 && usr.edad > 15)

    getYoungers(users).foreach(println)

    def filterByAge(l:List[Usuario], f:Usuario => Boolean): List[Usuario] = l.filter(f)

    val getBelow20s =(usr:Usuario) => usr.edad < 20
    val getBw15n20 = (usr:Usuario) => usr.edad < 20 && usr.edad > 15

    filterByAge(users, getBelow20s)

  }

}
