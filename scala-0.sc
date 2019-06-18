val nombre: String = "Maria"
val mensaje: String = s"Holis $nombre"
println(s"$mensaje jodete, con cariño")

//inferencia de tipo
val apellido = "Lopez"

val nombreCompleto = s"${nombre} ${apellido}"
println(nombreCompleto)

var edad: Int = 12
edad = 23

val estadoCivil: Boolean = false

if (estadoCivil){
  println(s"$nombre :)")
}else{
  println(s"$apellido :(")
}

def saludar(nombre: String = "Laura"): Unit ={
  println(s"Holis $nombre")
}

def saludar(): Unit ={
  println(s"Holis Gerardo")
}

def saludar(casado: Boolean): Unit ={
  println(s"Holis Gerardo")
}

/*
val  getEdad = match nombre {
    case "Juan" => 45
    case "Maria" => 34
    case "Luis" => 12
    case _ => 50
  }
*/

println({
  val a = 1
  a
})

//Expresiones
val data = {
  val x = 90
  x
}

println(data)


//colecciones
val lista:Array[Int] = Array(1,2,3,4,5)


//recorridos
for(numero <- lista){
  println(numero)
}

val nombres: List[String] = List("Juan", "Maria", "Alberto", "Jaime")


def filtrarPorLetraJ(nombre:String):Boolean=nombre.startsWith("J")

//def convertirMinuscula(nombre:String):String=nombre.toLowerCase
val convertirMinuscula = (item:String) => item.toLowerCase


val nombreporj=nombres.filter(filtrarPorLetraJ)
nombreporj.foreach(println)

val nombresPorJAMinuscula = nombres
  .filter(filtrarPorLetraJ)
  //.map(convertirMinuscula)
    .map(_.toLowerCase)

nombresPorJAMinuscula.foreach(println)


//lista de elementos retornar los elementos impares multiplicados por 2

val numbers: List[Int] = List(1,2,3,4,5,6,7,8,9,10)

val isOdd = (num:Int)=> num % 2 != 0


val oddNumsx2 = numbers
  .filter(isOdd)
    .map((item:Int) => item * 2)

oddNumsx2.foreach(println)


