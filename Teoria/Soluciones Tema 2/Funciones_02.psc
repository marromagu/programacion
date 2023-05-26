Funcion m <- Maximo ( n1, n2 )
	Definir m Como Entero
	Si n1 > n2 Entonces
		m = n1
	SiNo
		m = n2
	Fin Si
Fin Funcion

Algoritmo Ejercicio2
	Definir num1, num2, max Como Entero
	Escribir "Introduzca dos numeros"
	Leer num1, num2
	max = Maximo(num1,num2)
	Escribir "El maximo es " max
FinAlgoritmo
