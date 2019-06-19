val numeros = Range(1,100)
val sumatorio = numeros.reduce((x,y) => x + y)
println(s"Resultado de la suma es $sumatorio")


var sentences: List[String] = List("Mary read a story to Sam and Isla.",
"Isla cuddled Sam.",
"Sam chortled.")


sentences.reduce((a,b)=> a.count("Sam"))
