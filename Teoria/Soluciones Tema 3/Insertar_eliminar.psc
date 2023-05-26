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

// Función que desplaza a la derecha el contenido de un array
// a partir de la posición "pos"
Funcion desplazarDerecha(vector, pos, tam)
	Definir i Como Entero
	Para i = tam - 1 Hasta pos + 1 Con Paso -1 Hacer
		vector[i] = vector[i-1]
	Fin Para
FinFuncion

// Función que desplaza a la izquierda el contenido de un array
// hasta la posición "pos"
Funcion desplazarIzquierda(vector, pos, tam)
	Definir i Como Entero
	Para i = pos Hasta tam-2 Con Paso 1 Hacer
		vector[i] = vector[i+1]
	Fin Para
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

// Función que busca el hueco donde insertar el valor "dato"
Funcion pos = busquedaHueco(dato, v, tam)
	Definir i, pos Como Entero
	i = 0
	Mientras (i < tam Y v[i] < dato) Hacer
		i = i + 1
	Fin Mientras
	Si (i < tam)
		pos = i
	Sino 
		pos = - 1
	FinSi
FinFuncion

// Función que muestra el menu y devuelve la opción elegida
Funcion op = Menu(v,t)
	Definir op Como Entero
	Borrar Pantalla
	MostrarV(v, t)
	Escribir ""
	Escribir "Elige la operaión a realizar"
	Escribir ""
	Escribir "1.- Insertar elemento"
	Escribir "2.- Borrar elemento"	
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
					pos = busquedaBin(dato, vector, tam)
					// No existe en el array el valor a insertar
					Si (pos = -1) Entonces 
						// Si hay hueco para el valor a insertar: no es mayor que el último
						Si (vector[tam-1] > dato) Entonces
							pos = busquedaHueco(dato, vector, tam)
							desplazarDerecha(vector, pos, tam)
							vector[pos] = dato
						Fin Si
					Fin Si
				2:
					pos = busquedaBin(dato, vector, tam)
					// Muestra la posición si es distinta de "-1"
					Si (pos <> -1) Entonces
						desplazarIzquierda(vector, pos, tam)
					SiNo
						Escribir "No existe el elemento a borrar."
					Fin Si
				De Otro Modo:
					// No hace nada
			Fin Segun
			// El siguiente código es para que podamos ver el resultado
			// ya que estamos en un bucle y la función "Menu" borra la pantalla
			Escribir "Pulse una tecla para continuar"
			Esperar Tecla
		FinSi
	Mientras Que (op <> 0)
FinAlgoritmo
