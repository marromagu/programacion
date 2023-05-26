// Función que devuelve VERDADERO si son iguales dos vectores
Funcion res = iguales(v1, v2, tam)
	Definir res Como Logico
	Definir i Como Entero
	res = Verdadero
	Para i = 0 Hasta tam - 1 Con Paso 1 Hacer
		Si (v1[i] <> v2[i]) Entonces
			res = Falso
		FinSi
	Fin Para
FinFuncion

// Función que rellena el vector aleatoriamente
Funcion rellenar(v, tam)
	Definir i, num Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(10) 
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
	Si iguales(mat1,mat1,8) Entonces
		Escribir "Estos vectores:"
		ver(mat1,8)
		ver(mat1,8)
		Escribir "Son iguales"
	Fin Si
	Escribir ""
	Si NO iguales(mat1,mat2,8) Entonces
		Escribir "Estos vectores:"
		ver(mat1,8)
		ver(mat2,8)
		Escribir "No son iguales"
	Fin Si
FinAlgoritmo
