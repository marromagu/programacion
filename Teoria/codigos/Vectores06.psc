// Función que rellena el vector con "tam" con números impares
Funcion RellenarImpar  ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = 2*i+1
	Fin Para	
FinFuncion

// Función que muestra el vector "v" de tamaño "tam" 
Funcion MostrarAlReves ( v, tam)
	Definir i Como Entero
	Para i=tam-1 Hasta i Con Paso -1 Hacer
		Escribir v[i], " " Sin Saltar
	Fin Para
	Escribir ""
FinFuncion

// Programa principal
Algoritmo Vectores6
	Definir pares Como Entero
	Dimension impares[10]
	RellenarImpar(impares, 10)
	MostrarAlReves(impares, 10)
FinAlgoritmo
