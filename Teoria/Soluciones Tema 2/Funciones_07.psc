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

Funcion cont = DivisoresPrimos( n )
	Definir cont, i como Entero
	cont = 0
	i = 2
	Mientras (i <= n) Hacer
		Si (n MOD i == 0 Y Primo(i)) Entonces
			cont = cont + 1
		Fin Si
		i = i + 1
	Fin Mientras 	
Fin Funcion

Algoritmo Ejercicio7
	Definir num Como Entero
	Escribir "Introduzca un número enteros"
	Leer num
	
	Escribir "Tiene ", DivisoresPrimos(num)," divisores primos"
FinAlgoritmo


