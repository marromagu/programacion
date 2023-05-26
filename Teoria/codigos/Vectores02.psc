// Funci�n que rellena el vector con "tam" con n�meros pares
Funcion RellenarPares ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = i*2
	Fin Para	
FinFuncion

// Funci�n que muestra el vector "v" de tama�o "tam" 
Funcion MostrarP ( v, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir v[i], " " Sin Saltar
	Fin Para
	Escribir ""
FinFuncion

// Programa principal
Algoritmo Vectores2
	Definir pares Como Entero
	Dimension pares[20]
	RellenarPares(pares, 20)
	MostrarP(pares, 20)
FinAlgoritmo
