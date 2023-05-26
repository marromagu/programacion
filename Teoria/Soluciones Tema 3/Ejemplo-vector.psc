// Función que rellena un vector de tamaño "tam"
Funcion Rellenar(v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir "Valor posición ", i
		Leer v[i]
	Fin Para
FinFuncion
// Función que rellena aleatoriamente un vector de tamaño "tam"
Funcion RellenarAleatorio(v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(1000)
	Fin Para
FinFuncion

// Función que muestra el contenido de un vector de tamaño "tam"
Funcion Ver(v, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir v[i], " " Sin Saltar
	Fin Para
	Escribir ""
FinFuncion


Algoritmo Arrays
	Definir vector Como Entero
	Dimension vector[5]
	Escribir "Rellenar el contenido del vector por teclado:"
	Rellenar(vector, 5)
	Escribir "Ver el contenido del vector:"
	Ver(vector, 5)
	Escribir "Rellenar el contenido del vector aleatoriamente:"
	RellenarAleatorio(vector, 5)
	Escribir "Ver el contenido del vector:"
	Ver(vector, 5)
FinAlgoritmo
