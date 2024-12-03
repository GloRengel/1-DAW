//Escribe un algirtmo que, dado un número teclado, muestre en pantalla
//todos sus divisores.

Algoritmo DivisoresNum
	
	Definir num Como Entero;
	Definir contador Como Entero;
	
	Escribir "Introduzca un número: ";
	Leer num;
	contador <- 0;
	
	Mientras (contador <= num) Hacer
		num%contador <- 0;
		contador <- contador + 1;
		Leer num;
		Escribir "Los divisores son: ", num;
		
	FinMientras
	
FinAlgoritmo
