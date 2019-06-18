//Pure function
def sumar(x: Int, y: Int):Int = {
  x + y //the last line on a code block is always return
}

//Funcion anonima
val suma = (x:Int,y:Int) => {x+y}
println(suma(2,2))

//objetos
case class Persona(nombre:String, edad:Int)
//case class avoids using "new" keyword

val juan = Persona("Maria",20)
val janHappyBirthday = juan.copy(edad = juan.edad + 1) //avoids mutability of juan.edad

class Alumno(nombre:String, edad:Int) extends Persona(nombre,edad){}

//abstract class
abstract class Animal {
  def comer()
}

class Carnivoro extends Animal {
  override def comer(): Unit = {}
}

class Herviboro extends Animal {
  override def comer(): Unit = {}
}

val animales:List[Animal] = List(new Carnivoro)

for(animal <- animales){
  animal.comer()
}

animales.foreach(animal => animal.comer())

//objects
object Proceso {
  def monitorizar(): Boolean={
    true
  }
}

def comprobacionesSistemas= {
  val resultado = Proceso.monitorizar() //object function can be called w/o instantiating the object
}

//interfaces
trait Printer{
  def imprimir()
}

//"extends" keyword is also used for interfaces
class Document extends Printer{
  override def imprimir(): Unit = {}
}




