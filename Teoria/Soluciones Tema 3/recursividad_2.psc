Funcion res = potencia(base, exponente)
	Definir res Como Entero
	Si exponente == 0 Entonces
		res = 1
	SiNo
		res = base * potencia(base, exponente - 1)
	FinSi
FinFuncion


Algoritmo recursividad_2
	Definir b, ex Como Entero
	Escribir "Potencia de un número"
	Escribir "Introduzca la base"
	Leer b
	Escribir "Introduzca el exponente"
	Leer ex
	Escribir "El resultado es ", potencia(b, ex)
FinAlgoritmo
