//tuple
val ciudades = ("London","Paris")
val paris = ciudades._2
//tuples are indexed starting with 1

val diasSemanaLaborales: List[String] = List("L", "Ma", "Mi", "Ju", "Vi")
val diasSemanaFestivos: List[String] = List("Sa", "Do")

val diasSemana = diasSemanaLaborales ++ diasSemanaFestivos

println(diasSemana head) //returns first element
println(diasSemana tail) //returns last element
//predicado
val predicadoMenos20: Int => Boolean = (x:Int) => x <20

val numeros = Range(1,100)
//val numerosMenores20 = numeros.filter(n => n <20)
val numerosMenores20 = numeros.filter(predicadoMenos20)

val menores20menos5 = numerosMenores20.map(n => n-5)

//function composite
  val primero = numeros
                  .filter(predicadoMenos20)
                  .map(_ -5)
                  .head

println(primero)

//reduce o fold
val sumatorio = numeros.reduce((x,y) => x + y)
println(s"Resultado de la suma con reduce: $sumatorio")
//fold let u add an offset
val sumatorioOffset20 = numeros.fold(20)((x:Int,y:Int) => x + y)
println(s"Resultado de la suma con fold: $sumatorioOffset20")

//literal function
def procesar = (a:Int,b:Int) => a + b
//currying
def procesar21(a:Int) = (b:Int) => (a+1) + b

//intermediate
val procesarPartially = procesar21(2)
println(procesarPartially(3))

