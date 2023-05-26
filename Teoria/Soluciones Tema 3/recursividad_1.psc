Funcion mcd = maxComunDivisor(n1, n2)
	Definir mcd Como Entero
	Si (n1 MOD n2 == 0) Entonces
		mcd = n2
	SiNo
		mcd = maxComunDivisor(n2, n1 MOD n2)
	Fin Si
FinFuncion

// Para que el número mayor esté en n1 y el menor en n2
Funcion cambiar(n1 Por Referencia, n2 Por Referencia)
	Definir aux Como Entero
	aux = 0
	Si n1 < n2 Entonces
		aux = n1
		n1 = n2
		n2 = aux
	FinSi
FinFuncion

Algoritmo recursividad_1
	Definir num1, num2, mcd Como Entero
	Escribir "Cálculo del MCD de dos números"
	Escribir "Introduzca dos números"
	Leer num1, num2
	cambiar(num1, num2)
	mcd = maxComunDivisor(num1, num2)
	Escribir "EL mcd es ", mcd
FinAlgoritmo
