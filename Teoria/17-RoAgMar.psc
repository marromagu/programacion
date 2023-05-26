//Rellena un vector de 10 posiciones con valores aleatorios entre el 10 y el 100, ambos incluidos.
Funcion Rellenar_vector(v Por Referencia,t)
	Definir i Como Entero
	Escribir "Se ha generado el siguiente vector:" Sin Saltar
	Para i=0 Hasta t-1 Con Paso 1 Hacer
		v[i]= Azar(91)+10
	FinPara

FinFuncion
//Muestra el contenido actual del vector.
Funcion  Mostrar_vector(v,t)
	Definir i Como Entero
	Escribir "("Sin Saltar
	
	Para i=0 Hasta t-2 Con Paso 1 Hacer
		Escribir v[i], "-" Sin Saltar
	FinPara
	Escribir v[t-1] Sin Saltar
	Escribir ")"
FinFuncion
//Calcula la decena mas cercana a la media de los valores pares del vector y tambien de los impares.
Funcion Calcular_media(v,t)
	Definir i, pares,impares Como Entero
	Definir mediaImpares, mediaPares Como Real
	pares = 0
	impares = 0
	mediaImpares = 0
	mediaPares= 0
	Para i = 0 Hasta t - 1 Con Paso 1 Hacer
		si v[i] % 2 = 0 Entonces
			pares = pares + 1
			mediaPares = mediaPares + v[i]
		SiNo
			impares = impares + 1
			mediaImpares = mediaImpares + v[i]
		FinSi
	FinPara
	//Aqui voy redondeando las medias para no tener decimales
	mediaImpares = redon(mediaImpares/impares)
	mediaPares = redon(mediaPares/pares)
	//Dividimos entre 10 para luego redondear otra vez y asi tener un numero que al multiplicar por 10 nos de la decena que queremos como aproximacion 
	mediaImpares = redon(mediaImpares / 10)
	mediaPares = redon(mediaPares / 10)
	mediaImpares = mediaImpares * 10
	mediaPares = mediaPares * 10

	Si	pares = 0 Entonces
		Escribir "Nº de valores pares :",pares," No se puede calcular la media"
	SiNo
		Escribir "Nº de valores pares :",pares," -Media de los valores pares: Aproximadamente ", mediaPares
	FinSi
	Si	impares = 0 Entonces
		Escribir "Nº de valores impares :",impares," No se puede calcular la media"
	SiNo
		Escribir "Nº de valor impares :",impares," -Media de los valores impares: Aproximadamente ", mediaImpares
	FinSi
FinFuncion
//Guardar en un vector auxiliar y mostrar los dos valores mas bajos y los dos valores mas altos
Funcion Almacenar_extremos(v,t)
	Definir vectorAux, max,min,i, max2,min2 Como Entero
	Dimension vectorAux[4]
	max = v[0]
	max2=0
	Para i=0 Hasta t-1 Con Paso 1 Hacer
		Si (v[i] > max) Entonces
			max = v[i]
		SiNo
			max2 = v[i]
		Fin Si
	Fin Para
	min = v[0]
	min2=0
	Para i=0 Hasta t-1 Con Paso 1 Hacer
		Si (v[i] < min) Entonces
			min = v[i]
		SiNo
			min2 = v[i]
		Fin Si
	Fin Para
	//Tecnicamente esta todo bien puesto que ordenamos el vector primero
	vectorAux[0]=min
	vectorAux[1]=v[1]
	vectorAux[2]=v[8]
	vectorAux[3]=max
	Escribir "Valores extremos: "Sin Saltar
	Mostrar_vector(vectorAux,4)
FinFuncion
//Comprobara si hay algun valor repetido en el vector, indicando si lo hay o no
Funcion Valores_repetidos(v,tam)
	Definir i,j Como Entero
	Definir repetidos Como Logico
	repetidos = Falso
	Para i = 0 Hasta tam - 1 Con Paso 1 Hacer
		Para j = i + 1 Hasta tam - 1 Con Paso 1 Hacer
			si v[i]=v[j] Entonces
				repetidos = Verdadero
			FinSi
		FinPara
	FinPara
	Si	repetidos = Verdadero Entonces
		Escribir "Hay numeros repetidos"
	SiNo
		Escribir "No hay numeros repetidos"
	FinSi
FinFuncion
//Aplica al vector algoritmo de ordenacion de la burbuja "mejorado"
//(es decir, si en un recorrido no se realiza ningun intercambio el procedimiento de ordenacion deve terminar, sin llegar a realizar los recorridos previstos en el algoritmo estandar)
Funcion Ordenar_vector(v Por Referencia,t)
	//Ordenar Burbuja
	Definir i, j, aux, contador Como Entero;
	Para i=0 Hasta t-1 Con Paso 1 Hacer
		contador = 0
		Para j = t - 1 Hasta i + 1 Con Paso -1 Hacer
			Si (v[j] < v[j - 1]) Entonces
				aux = v[j]
				v[j] = v[j - 1]
				v[j - 1] = aux
			SiNo
				contador = contador + 1
			Fin Si
			si contador = (t - 1) Entonces
				i = t
			FinSi
		Fin Para
	Fin Para
FinFuncion
	// Función que muestra el menu y devuelve la opción elegida
	Funcion op = Menu
		Definir op Como Entero
		Escribir ""
		Escribir "Elige la operaión a realizar"
		Escribir ""
		Escribir "1.- Rellenar Vector"
		Escribir "2.- Mostrar vector"
		Escribir "3.- Calcular medias"
		Escribir "4.- Almacenar Extremos"	
		Escribir "5.- Valores Repetidos"
		Escribir "6.- Ordenar vector"
		Escribir "0.- Salir"
		Escribir ""
		Escribir "¿Opción?"
		Leer op
FinFuncion
// Programa principal
Algoritmo Examen_Mario_Romero
	Definir vector,op,cont1,cont2,cont3,cont4,cont5,cont6 Como Entero
	Dimension vector[10]
	//Contadores para saber cuantas veces se utiliza cada Opcion 
	cont1 = 0
	cont2 = 0
	cont3 = 0
	cont4 = 0
	cont5 = 0
	cont6 = 0
	Rellenar_vector(vector,10)
	Mostrar_vector(vector,10)
	Repetir
		// Muestar el menú y devuelve la opción elegida por el usuario
		op = Menu
		Si (op <> 0) Entonces
			Segun op Hacer
				1:
					Rellenar_vector(vector,10)
					Mostrar_vector(vector,10)
					cont1 = cont1 + 1
				2:
					Escribir "Contenido del vector: " Sin Saltar
					Mostrar_vector(vector,10)
					cont2 = cont2 + 1

				3: 
					Calcular_media(vector,10)
					cont3 = cont3 + 1
	
				4:
					//para que la funcion Extremos funcione perfectamente tenemos que ordenar primero la funcion
					Ordenar_vector(vector,10)
					Almacenar_extremos(vector,10)
					cont4 = cont4 + 1

				5:
					//Llama a la Funcion Repetidos para decir si hay o no repetidos
					Valores_repetidos(vector,10)
					cont5 = cont5 + 1
				6:
					Escribir "Vector ordenado: "Sin Saltar
					Ordenar_vector(vector,10)
					Mostrar_vector(vector,10)
					cont6 = cont6 + 1
				De Otro Modo:
					// No hace nada
			Fin Segun
			// El siguiente código es para que podamos ver el resultado
			// ya que estamos en un bucle y la función "Menu" borra la pantalla
			Escribir "Pulse una tecla para continuar"
			Esperar Tecla
		SiNo
			si cont1 > 0 Entonces
				Escribir "Opcion 1: ",cont1," veces"
			FinSi
			si cont2 > 0 Entonces
				Escribir "Opcion 2: ",cont2," veces"
			FinSi
			si cont3 > 0 Entonces
				Escribir "Opcion 3: ",cont3," veces"
			FinSi
			si cont4 > 0 Entonces
				Escribir "Opcion 4: ",cont4," veces"
			FinSi
			si cont5 > 0 Entonces
				Escribir "Opcion 5: ",cont5," veces"
			FinSi
			si cont6 > 0 Entonces
				Escribir "Opcion 6: ",cont6," veces"
			FinSi
			
		FinSi
	Mientras Que (op <> 0)
FinAlgoritmo

