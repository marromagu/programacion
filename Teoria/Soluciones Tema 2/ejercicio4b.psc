//Se dice que un número es hyperpar cuando todos sus dígitos son pares. Diseña una función booleana para comprobarlo.
Función resul = hyperpar(num)
Definir resul Como Logico
Definir cifra Como Entero
	resul = Verdadero
	Mientras 0<num Y resul == Verdadero Hacer
		cifra = num MOD 10
		Si cifra MOD 2 <> 0 Entonces
			resul = Falso
		FinSi
		num=trunc(num/10)
	FinMientras
FinFuncion

Proceso ejercicio4
	Definir num Como Entero
	Leer num 
	Si hyperpar(num) Entonces
		Escribir "es hyperpar"
	SiNo
		Escribir "no es hyperpar"
	FinSi	
FinProceso
