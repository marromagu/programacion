// Función para mostrar matriz
Funcion MostrarMatriz(mat, tam)
	Definir i, j Como Entero
	Para i=0 hasta tam-1 Con Paso 1 Hacer
		Para j=0 hasta tam-1 Con Paso 1 Hacer
			Escribir " ", mat[i,j] Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinFuncion

// Función para mostrar matriz
Funcion RellenarMatriz(mat, tam)
	Definir i, j Como Entero
	Para i=0 hasta tam-1 Con Paso 1 Hacer
		Para j=0 hasta tam-1 Con Paso 1 Hacer
			mat[i,j] = Azar(10)
		FinPara
	FinPara
FinFuncion

// Función para sumar matrices
Funcion SumarMatrices(Mat1,Mat2,MatResultado, tam)
	Definir i, j Como Entero
	Para i=0 hasta tam-1 Con Paso 1 Hacer
		Para j=0 hasta tam-1 Con Paso 1 Hacer
			MatResultado[i,j] = Mat1[i,j]  + Mat2[i,j] 
		FinPara
	FinPara
FinFuncion

// Función para restar matrices
Funcion RestarMatrices(Mat1,Mat2,MatResultado, tam)
	Definir i, j Como Entero
	Para i=0 hasta tam-1 Con Paso 1 Hacer
		Para j=0 hasta tam-1 Con Paso 1 Hacer
			MatResultado[i,j] = Mat1[i,j]  - Mat2[i,j] 
		FinPara
	FinPara
FinFuncion

// Función para multiplicar matrices
Funcion MultiplicarMatrices(Mat1,Mat2,MatResultado, tam)
	Definir i, j, k, aux Como Entero
	Para i=0 hasta tam-1 Con Paso 1 Hacer
		Para j=0 hasta tam-1 con paso 1 Hacer
			aux = 0
			Para k=0 hasta tam-1 Con Paso 1 Hacer
				aux = Mat1[i,k] * Mat2[k,j] + aux
			FinPara
			MatResultado[i,j] = aux
		FinPara
	FinPara	
FinFuncion

// Función que muestra el menú
Funcion op = Menu
	Definir op Como Entero
	Borrar Pantalla
	Escribir "Menu"
	Escribir "1.- Rellenar aleatoriamente matrices A y B"
	Escribir "2.- Sumar matrices: A + B"
	Escribir "3.- Restar matrices: A - B"
	Escribir "4.- Multiplicar matrices: A * B"
	Escribir "0.- Salir"
	Escribir ""
	Escribir "Elige una opción"
	Leer op
FinFuncion

// Programa principal
Algoritmo Matrices3
	Definir a, b, resultado, op, tam Como Real
	Dimension a[3,3], b[3,3], resultado[3,3]
	tam = 3
	Repetir
		op = Menu
		Segun op Hacer
			1:
				RellenarMatriz(a,tam)
				RellenarMatriz(b,tam)
			2:
				SumarMatrices(a,b,resultado,tam)
				Escribir "A + B"
			3:
				RestarMatrices(a,b,resultado,tam)
				Escribir "A - B"
			4:
				MultiplicarMatrices(a,b,resultado,tam)
				Escribir "A * B"
			De Otro Modo:
				
		Fin Segun
		Si (op <> 1 Y op <> 0)
			MostrarMatriz(resultado,tam)
			Escribir "Matriz A"
			MostrarMatriz(a,tam)
			Escribir "Matriz B"
			MostrarMatriz(b,tam)
		Fin Si	
		Escribir "Pulse una tecla para continuar"
		Esperar Tecla
	Mientras Que (op <> 0)
FinAlgoritmo
