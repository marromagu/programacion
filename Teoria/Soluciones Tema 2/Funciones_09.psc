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

Funcion mcm = MCM3 ( n1, n2, n3 )
	Definir mcm Como Entero
	mcm = Maximo3 ( n1, n2, n3 )
	Mientras ( (mcm MOD n1 <> 0) O (mcm MOD n2 <> 0) O (mcm MOD n3 <> 0) ) Hacer
		mcm = mcm + 1 
	Fin Mientras
Fin Funcion

Algoritmo Ejercicio9
	Definir num1, num2, num3 Como Entero
	Escribir "Introduzca tres números enteros"
	Leer num1, num2, num3
	Escribir "El máximo común divisor es ", MCM3(num1, num2, num3)
FinAlgoritmo


