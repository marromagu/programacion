// Función que rellena el vector con "tam" con números pares
Funcion RellenarNotas ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(11) 
	Fin Para	
FinFuncion

// Función que muestra cuantos suspensos, suficientes, bien, notables y sobresalientes hay.
Funcion MostrarNotas ( v, tam)
	Definir i, contSuspensos, contSuficientes, contBien, contNotable,contSobresaliente Como Entero
	contSuspensos=0
	contSuficientes=0
	contBien=0
	contNotable=0
	contSobresaliente=0
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Segun v[i] Hacer
			5:
				contSuficientes = contSuficientes +1
			6:
				contBien = contBien + 1
			7,8:
				contNotable = contNotable + 1
			9,10:
				contSobresaliente = contSobresaliente + 1
			De Otro Modo:
				contSuspensos = contSuspensos + 1
		Fin Segun
	Fin Para
	Escribir "Resultados:"
	Escribir contSuspensos, " suspenso"
	Escribir contSuficientes, " suficiente"
	Escribir contBien, " bien"
	Escribir contNotable, " notable"
	Escribir contSobresaliente, " sobresaliente"
FinFuncion


// Programa principal
Algoritmo Vectores4
	Definir notas Como Entero
	Dimension notas[100]
	RellenarNotas(notas, 100)
	MostrarNotas(notas,100)
FinAlgoritmo
