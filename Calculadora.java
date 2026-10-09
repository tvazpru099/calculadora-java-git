// Versión 1.1 - Práctica de Entornos de Desarrollo
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        /* Se asegura de cerrar el Scanner de forma automática al terminar de usarlo */
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2, resultado;
            int operacion;
            System.out.println("=== CALCULADORA BÁSICA EN JAVA - Conflicto otra rama=== ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.print("Elige una operación (1-5): ");
            operacion = scanner.nextInt();
            
			System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextDouble();
			
			System.out.print("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            switch (operacion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                }
                case 5 -> {
                    resultado = 1;
                    for (int i = 0; i < num2; i++) {
                        resultado *= num1;
                    }
                    System.out.println(num1 + " elevado a " + num2 + " = " + resultado);
                }
                case 6 -> {
                    resultado = 1;
                    System.out.println(Math.sqrt(num1));
                }
                default -> System.out.println("Opción no válida.");
            }
        } // Aquí finaliza el bloque 'try' y el scanner se cierra solo, ya no hace falta "scanner.close()"
    }
}