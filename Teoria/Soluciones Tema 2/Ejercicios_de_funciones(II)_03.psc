//Dise�ar una funci�n que devuelva la potencia de un n�mero. Recibir� como par�metros el n�mero y el exponente. El c�lculo lo realizar� por multiplicaciones sucesivas del n�mero.
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
