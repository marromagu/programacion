// Función que ordena el contenido del vector
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

// Función que muestra el contenido del vector
Funcion MostrarV(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Escribir v[i], " " Sin Saltar
	FinPara
	Escribir ""
FinFuncion

// Función que rellena el vector aleatoriamente
Funcion Rellenar(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i]= Azar(1000)
	FinPara
FinFuncion

// Función que rellena el vector aleatoriamente
Funcion OrdenaRec(v,tam)
	Definir i, NumMayor, aux Como Entero
	Si tam > 1 Entonces
		NumMayor = 0
		Para i=0 Hasta tam-1 Con Paso 1 Hacer
			Si v[i] > v[NumMayor] Entonces
				NumMayor = i
			FinSi
		FinPara
		aux = v[tam -1]
		v[tam-1] = v[NumMayor]
		v[NumMayor] = aux
		OrdenaRec(v,tam-1)
	FinSi

FinFuncion

// Programa principal
Algoritmo recursividad_5
	Definir vector, tam Como Entero
	Dimension vector[10]
	tam = 10
	// Rellenamos el array aleatoriamente
	Rellenar(vector, tam)
	MostrarV(vector, tam)
	// Ordenamos el array para poder utilzar todos los métodos de búsqueda
	OrdenaRec(vector,tam)
	MostrarV(vector, tam)
FinAlgoritmo
