// Funci�n que ordena por el m�todo selecci�n
Funcion ordenaSeleccion (v Por Referencia, tam)
	Definir i, j, vmenor, aux Como Entero;
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		// Se busca el menor elemnto desde "i"
		vmenor = i 
		Para j = i + 1 Hasta tam - 1 Con Paso 1 Hacer
			Si (v[j] < v[vmenor]) Entonces
				vmenor = j
			Fin Si
		Fin Para
		// Se intercambia el elmento "i" con el menor
		aux = v[i]
		v[i] = v[vmenor]
		v[vmenor] = aux
	Fin Para
FinFuncion

// Funci�n que ordena por el m�todo burbuja
Funcion ordenaBurbuja (v Por Referencia, tam)
	Definir i, j, aux Como Entero;
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Para j = tam - 1 Hasta i + 1 Con Paso -1 Hacer
			Si (v[j] < v[j - 1]) Entonces
				aux = v[j]
				v[j] = v[j - 1]
				v[j - 1] = aux
			Fin Si
		Fin Para
	Fin Para
FinFuncion

// Funci�n que muestra el contenido del vector
Funcion MostrarV(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir v[i], " " Sin Saltar
	FinPara
	Escribir ""
FinFuncion

// Funci�n que rellena el vector aleatoriamente
Funcion Rellenar(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i]= Azar(1000)
	FinPara
FinFuncion

// Funci�n que muestra el menu y devuelve la opci�n elegida
Funcion op = Menu(v,t)
	Definir op Como Entero
	Borrar Pantalla
	MostrarV(v, t)
	Escribir ""
	Escribir "Elige el m�todo de ordenaci�n"
	Escribir "1.- Ordenaci�n por selecci�n"
	Escribir "2.- Ordenaci�n por burbuja"
	Escribir "0.- Salir"
	Escribir ""
	Escribir "�Opci�n?"
	Leer op
FinFuncion

// Programa principal
Algoritmo Ordena_alg
	Definir vector, tam, dato, op Como Entero
	Dimension vector[10]
	tam = 10
	Rellenar(vector, tam)
	Repetir
		op = Menu(vector, tam)
		Segun op Hacer
			1:
				ordenaSeleccion(vector,tam)
			2:
				ordenaBurbuja(vector,tam)
			De Otro Modo:
				// No hace nada
		Fin Segun
		Escribir "Pulse una tecla para continuar"
		Esperar Tecla
	Mientras Que (op <> 0)
FinAlgoritmo
