//Diseñar el juego MasterMind, para ello utilizar las funciones Iguales y Aciertos de los ejercicios con matrices. Habrá que diseñar una función similar Semiaciertos, similar a Aciertos, que devolverá una S por cada semiacierto. 
//Un semiacierto será cuando hay valores que coinciden en ambos arrays pero en distintas posiciones.

//	El juego original es con 8 colores, considerarlo con número del 1 al 8, en un array de 4 posiciones. Habrá que diseñar también la función CreaCodigo, que rellene en un vector el código a adivinar.
	
//	El programa irá pidiendo al usuario que introduzca un código de cuatro dígitos con valores entre el 1 y el 8. Después de cada introducción de código le mostrará si ha acertado, en caso contrario,
//cuantos aciertos y semiaciertos ha tenido.
		
//		Inicialmente considerar un código sin repetición de valores.
Funcion MostrarC(v,tam)
	Definir i Como Entero
	Para i = 0 Hasta tam - 1  Con Paso 1 Hacer
		Escribir v[i],"|"Sin Saltar
	FinPara
	Escribir "Vector"
FinFuncion

Funcion CreaCodigo(v por referencia, tam)
	Definir i,n,j Como Entero
	Para i = 0 Hasta tam - 1  Con Paso 1 Hacer
		v[i]=0
	FinPara

		Para j = 0 Hasta tam-1  Con Paso 1 Hacer
			n=azar(8)+1
			Si v[j] <> n y v[0]<>n y v[1]<>n y v[2]<>n y v[3]<>n Entonces
				v[j] = n
			FinSi
	FinPara


FinFuncion
Funcion cifrar(n,v Por Referencia)
	Definir mil,cien,diez,uno Como Real
	mil=n
	cien = trunc(n/10)
	diez = trunc(n/100)
	uno = trunc(n/1000)
	diez = diez - uno*10
	cien = cien - uno*100
	cien = cien - diez*10
	mil = mil - uno*1000
	mil = mil - diez*100
	mil = mil - cien*10
	v[0]=uno
	v[1]=diez
	v[2]=cien
	v[3]=mil
	Escribir v[0]," | ",v[1]," | ",v[2]," | ",v[3]
FinFuncion
Funcion Rellenar(v por referencia, tam)
	Definir i Como Entero
	Para i = 0 Hasta tam - 1  Con Paso 1 Hacer
		Escribir "Dame un numero"
		Leer v[i]
	FinPara
FinFuncion
Funcion SemiAciertos(v,tam,v2)
	Definir aux1, aux2 Como Entero
	Definir i,j Como Entero
	Para  i = 0 Hasta tam -1  Con Paso 1 Hacer
		Para j = 0 Hasta tam-1  Con Paso 1 Hacer
			Si v[i] = v2[j] y v[j] <> v2[j] Entonces
				Escribir "S"," "Sin Saltar
			FinSi
		FinPara
	FinPara
	Escribir ""
FinFuncion
Funcion SemiIguales(v,tam,v2)
	Definir j Como Entero
	Para j = 0 Hasta tam-1  Con Paso 1 Hacer
		Si v[j] = v2[j] Entonces
			Escribir "A"," "Sin Saltar
		FinSi
	FinPara
	Escribir ""
FinFuncion

Funcion sonIguales = Iguales(v,tam,v2)
	Definir sonIguales Como Logico
	sonIguales = Falso
	Definir c, j Como Entero
	c = 0
		Para j = 0 Hasta tam-1  Con Paso 1 Hacer
			Si v[j] = v2[j] Entonces
				c = c + 1
			FinSi
		FinPara
		si c = tam Entonces
			sonIguales = Verdadero
		FinSi
FinFuncion
Algoritmo MasterMind
	Definir vector, vector2 Como Entero
	Dimension vector[4],vector2[4]
	CreaCodigo(vector,4)

	Definir n Como Entero
	Escribir "Adivina el numero"
	leer n
	cifrar(n,vector2)
	Mientras Iguales(vector,4,vector2) = Falso Hacer

		Escribir "------------------"
		SemiAciertos(vector,4,vector2)
		SemiIguales(vector,4,vector2)
		Escribir "------------------"
		Escribir "Adivina el numero"
		leer n
		cifrar(n,vector2)
	FinMientras
	Escribir "BIEN!!!"

FinAlgoritmo
