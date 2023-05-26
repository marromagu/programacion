// Función que lee una nota válida
Funcion nota = LeerNota 
	Definir nota como Real
	Leer Nota
	Mientras (nota > 10 O nota < 0) Hacer
		Escribir "Debe introducir un valor enter 0 y 10."
		Leer Nota
	FinMientras
FinFuncion

// Función que rellena el vector con "tam" notas
Funcion Rellenar ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = LeerNota
	Fin Para	
FinFuncion

// Función que devuelve la máxima nota del vector "v" de tamaño "tam" 
Funcion max = Maximo ( v, tam)
	Definir max como Real
	Definir i Como Entero
	max = v[0]
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] > max) Entonces
			max = v[i]
		Fin Si
	Fin Para
FinFuncion

// Función que devuelve la mínima nota del vector "v" de tamaño "tam" 
Funcion min = Minimo ( v, tam)
	Definir min como Real
	Definir i Como Entero
	min = v[0]
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] < min) Entonces
			min = v[i]
		Fin Si
	Fin Para
FinFuncion

// Función que devuelve la media de las notas del vector "v" de tamaño "tam" 
Funcion med = Media ( v, tam)
	Definir med como Real
	Definir i Como Entero
	med = 0
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		med = med + v[i]
	Fin Para
	med = med/tam
FinFuncion
// Programa principal
Algoritmo Vectores1
	Definir notas Como Real
	Dimension notas[5]
	Escribir  "Introducir 5 notas:"
	Rellenar(notas, 5)
	Escribir "La nota máxima es ", Maximo(notas, 5)
	Escribir "La nota mínima es ", Minimo(notas, 5)	
	Escribir "La nota media es ", Media(notas, 5)
FinAlgoritmo
