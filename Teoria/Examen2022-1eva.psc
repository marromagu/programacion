// Función que ordena por el método burbuja mejorado
Funcion ordenaBurbujaMej (v Por Referencia, tam)
	Definir i, j, aux Como Entero
	Definir cambio Como Logico
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		cambio = Falso
		Para j = tam - 1 Hasta i + 1 Con Paso -1 Hacer
			Si (v[j] < v[j - 1]) Entonces
				aux = v[j]
				v[j] = v[j - 1]
				v[j - 1] = aux
				cambio = Verdadero
			Fin Si
		Fin Para
		// Si no hay cambios, el vector ya está ordenado y terminamos dándole "i" el valor "tam"
		Si (NO cambio) Entonces 
			i = tam
		Fin Si
	Fin Para
FinFuncion

// Función que muestra el contenido del vector
Funcion MostrarV(v,tam)
	Definir i Como Entero
	Escribir "(", v[0] Sin Saltar
	Para i=1 Hasta tam-1 Con Paso 1 Hacer
		Escribir "-", v[i] Sin Saltar
	FinPara
	Escribir ")"
	Escribir ""
FinFuncion

// Función que muestra las veces que se ha elegido cada opción
Funcion VerContadores(v,tam)
	Definir i Como Entero
	Escribir ""
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] <> 0) Entonces
			Escribir "Opción ",i+1,": ", v[i]," veces."
		FinSi
	FinPara
FinFuncion

// Función que redondea a la decena más cercana 
Funcion res = Redondear(num)
	Definir ultCifra como Entero
	ultCifra = num MOD 10
	Si (ultCifra < 5) Entonces
		res = num - ultCifra
	Sino
		res = num - ultCifra + 10
	FinSi
FinFuncion

// Función que muestra las medias
Funcion Medias(v,tam)
	Definir i, contPares, contImpares, sumPares, sumImpares, media Como Entero
	contPares = 0
	contImpares = 0
	sumPares = 0
	sumImpares = 0
	// Recorre el vector contando y acumulando
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] % 2 == 0) Entonces
			contPares = contPares + 1
			sumPares = sumPares + v[i]
		Sino
			contImpares = contImpares + 1
			sumImpares = sumImpares + v[i]
		FinSi
	FinPara
	// Mostrar cálculos sobre pares
	Escribir "Nº de valores pares: ", contPares Sin Saltar
	Si (contPares <> 0) Entonces
		media = redon(sumPares/contPares)
		Escribir " - Media de los valores pares: Aproximadamente ", " Redondear(", media,")->", Redondear(media)
	Sino
		Escribir " - No se puede calcular la media"
	Fin Si
	// Mostrar cálculos sobre impares
	Escribir "Nº de valores impares: ", contImpares Sin Saltar
	Si (contImpares <> 0) Entonces
		media = redon(sumImpares/contImpares)
		Escribir " - Media de los valores impares: Aproximadamente ", " Redondear(", media,")->", Redondear(media)
	Sino
		Escribir " - No se puede calcular la media"
	Fin Si
FinFuncion

// Función que copia un vector en otro
Funcion CopiarV(vDestino,vOrigen,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		vDestino[i] = vOrigen[i]
	FinPara
FinFuncion

// Función que calcula y muestra los valores extremos
Funcion Extremos(v,tam)
	Definir vaux, vextr Como Entero
	Dimension vaux[10], vextr[4]
	CopiarV(vaux,v,tam)
	ordenaBurbujaMej(vaux,tam)
	// Rellenar extremos
	vextr[0] = vaux[0]
	vextr[1] = vaux[1]
	vextr[2] = vaux[tam-2]
	vextr[3] = vaux[tam-1]
	Escribir "Valores extremos: " Sin Saltar
	MostrarV(vextr, 4)
FinFuncion

// Función que rellena el vector aleatoriamente con valores entre 10 y 100
Funcion Rellenar(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i]= Azar(91) + 10
	FinPara
FinFuncion

// Función que inicializa a 0 todos los elementos de un array
Funcion ResetV(v,tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i]= 0
	FinPara
FinFuncion

// Función que comprueba si tiene valore repetidos
Funcion rep = ValoresRepetidos(vector, tam)
	Definir rep Como Logico
	Definir i, j Como Entero
	rep = Falso
	i = 0
	Mientras i < tam Y NO rep Hacer
		j = 0
		Mientras j < tam Y NO rep Hacer
			Si vector[i] == vector[j] Y i <> j Entonces
				rep = Verdadero
			Fin Si
			j = j + 1
		Fin Mientras
		i = i + 1
	Fin Mientras
FinFuncion

// Función que muestra el menu y devuelve la opción elegida
Funcion op = Menu
	Definir op Como Entero
	Borrar Pantalla
	Escribir "- Menu -"
	Escribir "--------"
	Escribir ""
	Escribir "1.- Rellenar vector"
	Escribir "2.- Mostrar vector"
	Escribir "3.- Calcular medias"
	Escribir "4.- Almacenar extremos"
	Escribir "5.- Valores repetidos"
	Escribir "6.- Ordenar vector"
	Escribir "0.- Salir"
	Escribir ""
	Escribir "¿Opción?" Sin Saltar
	Leer op
FinFuncion

// Programa principal
Algoritmo Examen
	Definir vector, tam, op Como Entero
	Definir cont Como Entero
	// Definición del vector y del vector de contadores
	Dimension vector[10], cont[6]
	tam = 10
	// Inicializamos los contadores de ejecución de las opciones de menú
	ResetV(cont,6)
	Repetir
		op = Menu
		Segun op Hacer
			1:
				Rellenar(vector, tam)
				Escribir "Se ha generado el siguiente vector:"
				MostrarV(vector, tam)
			2:
				Escribir "Contenido del vector: " Sin Saltar
				MostrarV(vector, tam)
			3:
				Medias(vector, tam)
			4:
				Extremos(vector, tam)
			5:
				Si ValoresRepetidos(vector, tam) Entonces
					Escribir "El vector tiene valores repetidos."
				SiNo
					Escribir "El vector NO tiene valores repetidos."
				FinSi
			6:
				ordenaBurbujaMej(vector,tam)
				Escribir "Vector ordenado: " Sin Saltar
				MostrarV(vector, tam)
			De Otro Modo:
				// No hace nada
		Fin Segun
		// Si es una opción válida
		Si (op >= 1 Y op <= 6) Entonces
			// Incrementamos el contador de la opción elegida
			cont[op-1] = cont[op-1] + 1
			Escribir "Pulse una tecla para continuar"
			Esperar Tecla
		Fin Si
	Mientras Que (op <> 0)
	// Mostramos los contadores
	VerContadores(cont,6)
FinAlgoritmo
