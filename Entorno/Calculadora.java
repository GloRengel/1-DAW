import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
    
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
        
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
        
        scanner.close();
    }
}
