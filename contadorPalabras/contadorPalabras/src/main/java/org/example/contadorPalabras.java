package org.example;

/**
 * Aplicación contadorPalabras.
 *
 * Lee líneas de texto desde la entrada estándar (stdin) hasta EOF, cuenta el
 * número total de palabras (secuencias separadas por uno o más espacios) y
 * muestra el total en la salida estándar (stdout).
 *
 * Uso: java contadorPalabras (o encadenado con |)
 */
import java.util.Scanner;

public class contadorPalabras {
    /**
     * Método principal.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPalabras = 0;

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            // Divide la línea por espacios (múltiples se ignoran con split("\\s+"))
            String[] palabras = linea.split("\\s+");
            totalPalabras += palabras.length;
        }
        scanner.close();

        System.out.println("Número total de palabras: " + totalPalabras);
    }
}