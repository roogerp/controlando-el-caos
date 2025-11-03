package caos;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA - SUMA ===");

        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        double resultado = a + b;

        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);

        sc.close();
    }
}
