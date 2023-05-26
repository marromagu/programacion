Funcion MostrarNumerosEntre ( n1, n2 )
	Definir i, nmayor, nmenor Como Entero
	Si n1 > n2 Entonces
		nmayor = n1
		nmenor = n2
	Sino
		nmayor = n2
		nmenor = n1
	Fin Si
	Para i<-nmenor Hasta nmayor Con Paso 1 Hacer
		Escribir i, " " Sin Saltar
	Fin Para
	Escribir ""
Fin Funcion

Algoritmo Ejercicio5
	Definir num1, num2 Como Entero
	Escribir "Introduzca dos numeros"
	Leer num1, num2
	MostrarNumerosEntre(num1, num2)
FinAlgoritmo
