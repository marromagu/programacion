// Función que rellena la posición inicial de un tablero de ajedrez con SI
Funcion RellenarTableroSi (t Por Referencia)
	Definir i, j como Entero
	Para i=0 hasta 7 con paso 1
		Para j=0 hasta 7 con paso 1
			Si (i == 1 O i == 6) Entonces
				t[i,j] = 'P'
			Sino
				Si (i == 0 O i == 7) Entonces
					Si (j == 0 O j == 7) Entonces
						t[i,j] = 'T'
					Fin Si
					Si (j == 1 O j == 6) Entonces
						t[i,j] = 'C'
					Fin Si
					Si (j == 2 O j == 5) Entonces
						t[i,j] = 'A'
					Fin Si
					Si (j == 3) Entonces
						t[i,j] = 'Q'
					Fin Si
					Si (j == 4) Entonces
						t[i,j] = 'K'
					Fin Si
				Sino
					t[i,j] = '-'
				Fin Si
			Fin Si
		FinPara
	FinPara	
FinFuncion

// Función que rellena la posición inicial de un tablero de ajedrez con SEGUN
Funcion RellenarTableroSegun (t Por Referencia)
	Definir i, j como Entero
	Para i=0 hasta 7 con paso 1
		Para j=0 hasta 7 con paso 1
			// "Según" que gestiona las filas
			Segun i Hacer
				0,7:
					// "Según" que gestiona las columnas
					Segun j Hacer
						0,7:
							t[i,j] = 'T'
						1,6:
							t[i,j] = 'C'
						2,5:
							t[i,j] = 'A'
						3:
							t[i,j] = 'Q'
						4:
							t[i,j] = 'K'
					Fin Segun
				1,6:
					t[i,j] = 'P'
				De Otro Modo:
					t[i,j] = '-'
			Fin Segun
		FinPara
	FinPara	
FinFuncion

// Función que muestra el contenido de un tablero de ajedrez
Funcion MostrarTablero (t)
	Definir i, j como Entero
	Escribir ""
	Para i=0 hasta 7 con paso 1
		Para j=0 hasta 7 con paso 1
			Escribir " ", t[i,j] sin saltar
		FinPara
		Escribir ""
	FinPara
FinFuncion

// Ejercicio con tablas
Algoritmo tablas2
	Definir ajedrez Como Caracter
	Dimension ajedrez[8,8]
	RellenarTableroSi(ajedrez)
	MostrarTablero(ajedrez)
	RellenarTableroSegun(ajedrez)
	MostrarTablero(ajedrez)
FinAlgoritmo
