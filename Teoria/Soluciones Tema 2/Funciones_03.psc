Funcion m <- Maximo ( n1, n2 )
	Definir m Como Entero
	Si n1 > n2 Entonces
		m = n1
	SiNo
		m = n2
	Fin Si
Fin Funcion

Funcion m <- Maximo3 ( n1, n2, n3 )
	Definir m Como Entero
	m = Maximo( n1, Maximo(n2,n3) )
Fin Funcion

Funcion m <- Maximo4 ( n1, n2, n3, n4 )
	Definir m Como Entero
	m = Maximo( Maximo(n1,n2), Maximo(n3,n4) )
Fin Funcion

Algoritmo Ejercicio_03
	Definir num1, num2, num3 Como Entero
	Escribir "Introduzca tres números:"
	Leer num1, num2, num3
	Escribir "El mayor es ", Maximo3(num1, num2, num3)
FinAlgoritmo


