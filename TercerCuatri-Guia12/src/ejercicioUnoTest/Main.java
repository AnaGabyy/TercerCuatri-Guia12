package ejercicioUnoTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*1)Crear un programa que lea un número entero desde la consola y lo imprima en la consola.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("El número ingresado es: " + numero);

    }
}
