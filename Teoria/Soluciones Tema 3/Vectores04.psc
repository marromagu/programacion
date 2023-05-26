// Función que rellena el vector con "tam" con números pares
Funcion RellenarNotas ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(11) 
	Fin Para	
FinFuncion

// Función que cuenta las notas aprobadas del vector "v" de tamaño "tam" 
Funcion cont = CuentaAprobados ( v, tam)
	Definir cont, i Como Entero
	cont = 0
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] >= 5) Entonces
			cont = cont + 1
		Fin Si
	Fin Para
FinFuncion

// Función que cuenta las notas aprobadas del vector "v" de tamaño "tam" 
Funcion cont = CuentaSuspensos ( v, tam)
	Definir cont, i Como Entero
	cont = 0
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] < 5) Entonces
			cont = cont + 1
		Fin Si
	Fin Para
FinFuncion

// Programa principal
Algoritmo Vectores4
	Definir notas Como Entero
	Dimension notas[100]
	RellenarNotas(notas, 100)
	Escribir "Aprobados: ", CuentaAprobados(notas,100)
	Escribir "Suspensos: ", CuentaSuspensos(notas,100)
FinAlgoritmo
