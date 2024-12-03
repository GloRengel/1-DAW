//Escribe un algoritmo que solicite el calor del lado de un cuadrado y dibuje uno de dicho tamaño
//en pantalla con asteriscos. Supongamos que el usuario introduce el valor 5 para el lado;
//en pantalla se deberá dibujar.

Algoritmo DibujoCuadrado
	
	Definir n Como Entero;
	
	Escribir "Introduzca el número de lados del cuadrado: ";
	Leer n;
	contador <- 1
	
	Mientras (contador <= n) Hacer
		Escribir "*"," ";
		contador <- contador + 1
	FinMientras
	
	//Repetir 
		//Para n = 1 hasta n Hacer
			//Escribir "*"
		//FinPara
	//Hasta Que 
	
FinAlgoritmo
