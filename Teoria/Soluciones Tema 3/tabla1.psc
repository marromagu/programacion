// Función que rellena una tabla pasad por refenecia de tamaño "fil" X "col" con 0s y 1s
Funcion RellenarTabla (t Por Referencia, fil, col)
	Definir i, j como Entero
	Para i=0 hasta 9 con paso 1
		Para j=0 hasta 9 con paso 1
			t[i,j] = Azar(2)
		FinPara
	FinPara	
FinFuncion

// Función que muestra una tabla edl contenido de tamaño "fil" X "col"
Funcion MostrarTabla (t, fil, col)
	Definir i, j como Entero
	Para i=0 hasta 9 con paso 1
		Para j=0 hasta 9 con paso 1
			Escribir " ", t[i,j] sin saltar
		FinPara
		Escribir ""
	FinPara
FinFuncion

// Ejercicio con tablas
Algoritmo tablas1
	Definir tabla Como Entero
	Dimension tabla[10,10]
	RellenarTabla(tabla, 10, 10)
	MostrarTabla(tabla, 10, 10)
FinAlgoritmo
