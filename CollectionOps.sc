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