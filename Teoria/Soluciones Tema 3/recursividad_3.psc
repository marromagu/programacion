Funcion imprimirLista(n)
	Si n == 1 Entonces
		Escribir n
	SiNo
		Escribir n, " " Sin Saltar
		imprimirLista(n-1)
	Fin Si
FinFuncion


Algoritmo recursividad_3
	Definir num Como Entero
	Escribir "Introduzca un número entero"
	Leer num
	imprimirLista(num)
FinAlgoritmo
