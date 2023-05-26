// Rellena recursivamente el vector
Funcion rellenarR(v, tam)
	Si tam > 0 Entonces
		v[tam-1] = Azar(100)
		rellenarR(v,tam-1)
	Fin Si
FinFuncion

// Muestr recursivamente el vector
Funcion mostrarR(v, tam)
	Si tam > 0 Entonces
		mostrarR(v,tam-1)
		Escribir v[tam-1]," " Sin Saltar
	Fin Si
FinFuncion

Algoritmo recursividad_4
	Definir vector Como Entero
	Dimension vector[10]
	rellenarR(vector,10)
	mostrarR(vector,10)
	Escribir  ""
FinAlgoritmo
