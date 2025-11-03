package caos;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Básica ===");

        // Leer números por teclado
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        // Operaciones
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        
        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: Error, no se puede dividir entre 0");
        }

        sc.close();
    }
}
