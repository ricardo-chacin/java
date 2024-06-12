package Actividades;

import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");
        palabra = palabra.replace("ú", "u");

        for (int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
    }
}

