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

Algoritmo Ejercicio1
	// Se dice un número es perfecto cuando la suma de sus divisores, 
	// excepto el mismo, es igual a dicho número. Es decir el número 6 
	//es perfecto porque 6=3+2+1. Diseñar una función booleana que reciba 
	//como parámetro un número y devuelva si es perfecto o no.
	Definir num Como Entero
	Escribir "Introoduzca un número"
	Leer num
	Si esPerfecto(num) Entonces
		Escribir "Es perfecto"
	SiNo
		Escribir "No es perfecto"
	Fin Si
FinAlgoritmo
