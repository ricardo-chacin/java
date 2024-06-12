package Actividades;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El numero ingresado no es positivo");
        }
        else
            for (int i = 0; i <= numero; i++); {
                if ( i % 2 == 0) {
                    System.out.println(i + "El numero es par");
                } else {
                    System.out.println(i + "El numero es impar ");
                }

        }

        scanner.close();

    }
}