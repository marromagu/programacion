//Diseñar una función que devuelva la potencia de un número. Recibirá como parámetros el número y el exponente. El cálculo lo realizará por multiplicaciones sucesivas del número.
Funcion p=Potencia(num, exponente)
	Definir i, p Como Entero
	p = 1
	Para i = 1 Hasta exponente Con Paso 1 Hacer
		p = p * num
	FinPara
FinFuncion

Algoritmo Ejercicio_03
	Definir num, expo Como Entero
	Escribir "Escribe un numero y un exponente para calcular la potencia"
	Leer num, expo
	Escribir "La potencia de ", num, " con exponente ",expo, " Es igual a: ", Potencia(num,expo)
FinAlgoritmo
