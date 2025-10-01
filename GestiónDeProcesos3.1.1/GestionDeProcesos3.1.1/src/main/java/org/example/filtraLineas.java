package org.example;/**
 * Aplicación filtraLineas.
 *
 * Lee líneas de texto desde la entrada estándar (stdin) hasta EOF y muestra
 * en la salida estándar (stdout) solo aquellas líneas que contengan más de 20 caracteres.
 *
 * Uso: java filtraLineas (o encadenado con |)
 *
 */
import java.util.Scanner;

class filtraLineas {
    /**
     * Método principal.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (linea.length() > 20) {
                System.out.println(linea);  // Filtra y envía
            }
        }
        scanner.close();  // Cierra el scanner
    }
}