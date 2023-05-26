// Función que devuelve una letra "A" por cada acierto
Funcion res = aciertos(v1, v2, tam)
	Definir res Como Caracter
	Definir i Como Entero
	res = ""
	Para i = 0 Hasta tam - 1 Con Paso 1 Hacer
		Si (v1[i] == v2[i]) Entonces
			res = res + 'A'
		FinSi
	Fin Para
FinFuncion

// Función que rellena el vector aleatoriamente
Funcion rellenar(v, tam)
	Definir i, num Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(5) 
	Fin Para
FinFuncion

// Función que muestra el vector
Funcion ver(v, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir v[i]," " Sin Saltar
	Fin Para
	Escribir ""
FinFuncion

// Programa principal
Algoritmo MasterMind
	Definir mat1, mat2 Como Entero
	Dimension mat1[8], mat2[8]
	rellenar(mat1,8)
	rellenar(mat2,8)
	ver(mat1,8)
	ver(mat2,8)
	Escribir ""
	Escribir "Cada A indica un número que coincide en ambos arrays en la misma posición:"
	Escribir aciertos(mat1,mat2,8)
FinAlgoritmo
