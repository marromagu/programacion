//Se dice que un n�mero es hyperpar cuando todos sus d�gitos son pares. Dise�a una funci�n booleana para comprobarlo.
Funci�n resul = hyperpar(num)
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
