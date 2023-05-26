// Función que rellena el vector con "tam" con números pares
Funcion Tiradas ( v Por Referencia, tam)
	Definir i Como Entero
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		v[i] = Azar(6) + 1
	Fin Para	
FinFuncion

// Función que muestra las tiradas de dados guardadas en el vector "v" de tamaño "tam" 
Funcion cont = ContarPunto ( v, punto, tam)
	Definir cont, i Como Entero
	cont = 0
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si (v[i] == punto) Entonces
			cont = cont + 1
		Fin Si
	Fin Para
FinFuncion

// Programa principal
Algoritmo Vectores3
	Definir dados Como Entero
	Dimension dados[100]
	Tiradas(dados, 100)
	Escribir "El 1 ha salido ", ContarPunto(dados,1,100)," veces"
	Escribir "El 2 ha salido ", ContarPunto(dados,2,100)," veces"
	Escribir "El 3 ha salido ", ContarPunto(dados,3,100)," veces"
	Escribir "El 4 ha salido ", ContarPunto(dados,4,100)," veces"
	Escribir "El 5 ha salido ", ContarPunto(dados,5,100)," veces"
	Escribir "El 6 ha salido ", ContarPunto(dados,6,100)," veces"
FinAlgoritmo
