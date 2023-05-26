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

// Función que pide el valor a buscar
Funcion Pedir(d Por Referencia)
	Escribir "Introduzca el valor a buscar:"
	Leer d
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

// Función que busca el valor "dato" en el array "v" de tamaño "tam"
// y devuelve la posición en que se encuentra o "-1" si no existe
Funcion pos = busqueda(dato, v, tam)
	Definir i, pos Como Entero
	i = 0
	pos = -1
	Mientras (i < tam Y pos == -1) Hacer
		Si (v[i] == dato) Entonces
			pos = i
		Fin Si
		i = i + 1
	Fin Mientras
FinFuncion

// Función que busca el valor "dato" en el array ordenado "v" de tamaño "tam"
// y devuelve la posición en que se encuentra o "-1" si no existe
Funcion pos = busquedaOrd(dato, v, tam)
	Definir i, pos Como Entero
	i = 0
	pos = -1
	Mientras (i < tam Y pos == -1 Y v[i] <= dato) Hacer
		Si (v[i] == dato) Entonces
			pos = i
		Fin Si
		i = i + 1
	Fin Mientras
FinFuncion

// Función que busca el valor "dato" en el array ordenado "v" de tamaño "tam"
// y devuelve la posición en que se encuentra o "-1" si no existe
Funcion centro = busquedaBin(dato, v, tam)
	Definir izq, der, centro Como Entero
	Definir encontrado Como Logico
	izq = 0
	der = tam-1
	encontrado = Falso
	Mientras (izq <= der Y NO encontrado) Hacer
		centro = trunc((izq + der) / 2)
		Si (v[centro] == dato) Entonces
			encontrado = Verdadero
		SiNo
			Si (dato > v[centro]) Entonces
				izq = centro + 1
			SiNo
				der = centro - 1
			Fin Si
		Fin Si
	Fin Mientras
	Si (NO encontrado) Entonces
		centro = -1
	Fin Si
FinFuncion

// Función que muestra el menu y devuelve la opción elegida
Funcion op = Menu(v,t)
	Definir op Como Entero
	Borrar Pantalla
	MostrarV(v, t)
	Escribir ""
	Escribir "Elige el método de búsqueda"
	Escribir "1.- Búsqueda simple"
	Escribir "2.- Búsqueda ordenada"	
	Escribir "3.- Búsqueda binaria"
	Escribir "0.- Salir"
	Escribir ""
	Escribir "¿Opción?"
	Leer op
FinFuncion

// Programa principal
Algoritmo Busqueda_alg
	Definir vector, tam, dato, pos, op Como Entero
	Dimension vector[10]
	tam = 10
	// Rellenamos el array aleatoriamente
	Rellenar(vector, tam)
	// Ordenamos el array para poder utilzar todos los métodos de búsqueda
	ordenaBurbuja(vector,tam)
	Repetir
		// Muestar el menú y devuelve la opción elegida por el usuario
		op = Menu(vector, tam)
		Si (op <> 0) Entonces
			// Pide el dato a buscar
			Pedir(dato)
			Segun op Hacer
				1:
					pos = busqueda(dato, vector, tam)
				2:
					pos = busquedaOrd(dato, vector, tam)
				3:
					pos = busquedaBin(dato, vector, tam)
				De Otro Modo:
					// No hace nada
			Fin Segun
			// Muestra la posición si es distinta de "-1"
			Si (pos <> -1) Entonces
				Escribir "Está en la posición: ", pos
			SiNo
				Escribir "No existe"
			Fin Si
			// El siguiente código es para que podamos ver el resultado
			// ya que estamos en un bucle y la función "Menu" borra la pantalla
			Escribir "Pulse una tecla para continuar"
			Esperar Tecla
		FinSi
	Mientras Que (op <> 0)
FinAlgoritmo
