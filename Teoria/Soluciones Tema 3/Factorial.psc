Funcion f = factorial(n)
	Definir f Como Entero
	Si (n == 0 O n == 1) Entonces
		f = 1
	SiNo
		f = n * factorial(n-1)
	Fin Si
FinFuncion

Algoritmo ejemplo
	Definir num Como Entero
	Escribir "Cálculo del factorial de un número"
	Escribir "Introduzca un número"
	Leer num
	Escribir "El factorial de ", num, " es ",factorial(num)
FinAlgoritmo
