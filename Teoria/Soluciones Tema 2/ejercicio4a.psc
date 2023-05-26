//Se dice que un número es hyperpar cuando todos sus dígitos son pares. Diseña una función booleana para comprobarlo.
Función resul = hyperpar(num)
	Definir resul Como Logico
	Definir cifras, cifraspares Como Entero
	cifras=1
	cifraspares=1
	Mientras 0<num Hacer
		Si (num MOD 10) MOD 2 == 0 Entonces
			cifraspares<-cifraspares+1
		FinSi
		cifras<-cifras+1
		num=trunc(num/10)
	FinMientras
	Si cifraspares == cifras Entonces
		resul = Verdadero
	SiNo
		resul = Falso
	FinSi
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
