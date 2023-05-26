Funcion resul = esPerfecto(n)
	Definir resul Como Logico
	Definir div, sum Como Entero
	sum = 0
	Para div = 1 Hasta n-1 Con Paso 1 Hacer
		Si n MOD div == 0 Entonces
			sum = sum + div
		Fin Si
	Fin Para
	resul = (n == sum)
FinFuncion

Funcion VerPerfectos(n1, n2)
	Para i = n1 Hasta n2 Con Paso 1 Hacer
		Si esPerfecto(i) Entonces
			Escribir i
		Fin Si
	Fin Para
FinFuncion

Algoritmo Ejercicio2
	// Diseñar una función que reciba dos números y muestre los números 
	// perfectos que hay entre los 2 números. 
	// Suponemos que el primero es menor que el segundo.
	Definir num1, num2 Como Entero
	Escribir "Introduzca dos números"
	Leer num1, num2
	VerPerfectos(num1, num2)
FinAlgoritmo
