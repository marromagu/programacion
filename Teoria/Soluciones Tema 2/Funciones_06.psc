Funcion esPrimo = Primo ( n )
	Definir esPrimo como Logico
	Definir i Como Entero
	esPrimo = Verdadero
	i = 2
	Mientras (i <= rc(n) Y esPrimo) Hacer
		Si (n MOD i == 0) Entonces
			esPrimo = Falso
		Fin Si
		i = i + 1
	Fin Mientras
Fin Funcion

Algoritmo Ejercicio6
	Definir num Como Entero
	Escribir "Introduzca un número enteros"
	Leer num
	Si Primo(num) Entonces
		Escribir "Es primo"
	Sino
		Escribir "No es primo"
	Fin Si
FinAlgoritmo


