// Función que muestra el menú
Funcion res = Menu
	Definir res Como Caracter
	Escribir "MENU"
	Escribir "a) Sumar (n1 + n2)"
	Escribir "b)  Restar (n1 - n2)"
	Escribir "c) Multiplicar (n1 * n2)"
	Escribir "d) Dividir (n1 / n2)"
	Escribir "S) Salir."
	Escribir "Introduzca la opción elegida (a|b|c|d):"
	Leer res
FinFuncion
// Función que recibe dos números y devuelve la suma de ambos
Funcion res = Sumar(n1,n2)
	Definir res Como Entero
	res = n1 + n2
FinFuncion
// Función que recibe dos números y devuelve la resta de ambos
Funcion res = Restar(n1,n2)
	Definir res Como Entero
	res = n1 - n2
FinFuncion
// Función que recibe dos números y devuelve el producto de ambos
Funcion res = Multiplicar(n1,n2)
	Definir res Como Entero
	res = n1 * n2
FinFuncion
// Función que recibe dos números y devuelve la división del priemro entre el segundo
Funcion res = Dividir(n1,n2)
	Definir res Como Real
	res = n1 / n2
FinFuncion
// Función que pide dos números por teclado
Funcion Pedir(n1 Por Referencia,n2 Por Referencia)	
	Escribir "Introduzca el primer numero"
	Leer n1
	Escribir "Introduzca el segundo numero"
	Leer n2
FinFuncion


// Programa principal
Algoritmo Ejercicio_funciones
	Definir num1, num2 Como Entero
	Definir op Como Caracter
	Repetir
		Pedir(num1,num2)
		op = Menu
	
		Segun (op)
			'a': Escribir "El resultado de la suma es: ", Sumar(num1,num2)
			'b': Escribir "El resultado de la suma es: ", Restar(num1,num2)
			'c': Escribir "El resultado de la suma es: ", Multiplicar(num1,num2)
			'd': Escribir "El resultado de la suma es: ", Dividir(num1,num2)
		FinSegun
	Mientras Que (op <> 'S')
FinAlgoritmo
