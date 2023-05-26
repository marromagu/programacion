// Función que rellena una tabla de "f" filas y "c" columnas
Funcion RellenarT(t Por Referencia, f, c)
	Definir i, j Como Entero
	Para i=0 Hasta f-1 Con Paso 1 Hacer
		Para j=0 Hasta c-1 Con Paso 1 Hacer
			Escribir "Valor fila: ", i,", columna: ",j
			Leer t[i,j]
		Fin Para
	Fin Para
FinFuncion
// Función que rellena una tabla de "f" filas y "c" columnas
Funcion RellenarAleatorioT(t Por Referencia, f, c)
	Definir i, j Como Entero
	Para i=0 Hasta f-1 Con Paso 1 Hacer
		Para j=0 Hasta c-1 Con Paso 1 Hacer
			t[i,j] = Azar(1000)
		Fin Para
	Fin Para
FinFuncion

// Función que muestra el contenido de una tabla de "f" filas y "c" columnas
Funcion VerT(t, f, c)
	Definir i, j Como Entero
	Para i=0 Hasta f-1 Con Paso 1 Hacer
		Para j=0 Hasta c-1 Con Paso 1 Hacer
			Escribir t[i,j], " " Sin Saltar
		Fin Para
		Escribir ""
	Fin Para
FinFuncion


Algoritmo Tablas
	Definir tabla Como Entero
	Dimension tabla[2,4]
	Escribir "Rellenar el contenido de una tabla por teclado:"
	RellenarT(tabla, 2, 4)
	Escribir "Ver el contenido de la tabla:"
	VerT(tabla, 2, 4)
	Escribir "Rellenar el contenido de una tabla aleatoriamente:"
	RellenarAleatorioT(tabla, 2, 4)
	Escribir "Ver el contenido de la tabla:"
	VerT(tabla, 2, 4)
FinAlgoritmo
