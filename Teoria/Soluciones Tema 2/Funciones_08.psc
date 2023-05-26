Funcion mcd = MCD3 ( n1, n2, n3 )
	Definir mcd Como Entero
	mcd = n1
	Mientras ( (n1 MOD mcd <> 0) O (n2 MOD mcd <> 0) O (n3 MOD mcd <> 0) ) Hacer
		mcd = mcd - 1 
	Fin Mientras
Fin Funcion

Algoritmo Ejercicio8
	Definir num1, num2, num3 Como Entero
	Escribir "Introduzca tres números enteros"
	Leer num1, num2, num3
	Escribir "El máximo común divisor es ", MCD3(num1, num2, num3)
FinAlgoritmo


