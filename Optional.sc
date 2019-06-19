import sun.nio.cs.ext.DoubleByteEncoder

import scala.util.Try

/*sealed trait Option[A]

case class Some[A](valor:A) extends Option[A]
case class None[A]() extends Option[A]*/
//funcion total
def dividir(dividendo:Int, divisor:Int): Option[Int] = {
  if (divisor == 0){
    None
  }
  else{
    Some(dividendo/divisor)
  }
}

val resultadoDiv = dividir(6,0)
println(resultadoDiv)

val usuarios: Map[String, String] =
  Map("jlopez" -> "Juan Lopez",
  "lcortez" -> "Laura Cortez",
  "jj" -> "James Jameson")

def obtenerUsuario(clave: String): Option[String] = {
  if (usuarios.contains(clave))  usuarios.get(clave)
  else None
}

val usuario = obtenerUsuario("lcortez")
println(usuario.getOrElse(usuario))
usuarios.getOrElse("mcarrion", "No existe")

//Pattern matching
val x = 20
val acierto = x match {
  case 100 => "100 o mas"
  case 90 => "acierto"
  case _ => "No comments"
}

obtenerUsuario("mcarrion") match{
  case Some(u) => println(s"Usuario encontrado $u")
  case None => println(s"Ususario no encontrado")
}

def dividir(a:Double, b: Double): Double ={
  if (b ==0) throw new RuntimeException("Div pir 0")
  else a/b
}

def dividirPure(a:Double, b: Double): Try[Double] ={
  Try{dividir(a,b)}
}

println(dividirPure(6,0))

