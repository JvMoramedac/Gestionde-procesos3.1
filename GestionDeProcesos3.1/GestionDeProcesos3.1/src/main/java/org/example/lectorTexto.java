package org.example; /**
 * Aplicación lectorTexto.
 * <p>
 * Lee el contenido de un archivo de texto llamado "entrada.txt" línea por línea
 * y lo imprime en la salida estándar (stdout).
 * Si el archivo no existe, muestra un mensaje de error y termina.
 * <p>
 * Uso: java lectorTexto
 *
 */

import java.io.*;

public class lectorTexto {
    /**
     * Método principal.
     *
     * @param args No se usan argumentos.
     */
    public static void main(String[] args) {
        try (InputStream is = lectorTexto.class.getResourceAsStream("/entrada.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);  // Envía línea a stdout
            }
        } catch (IOException e) {
            if (e.getMessage().contains("entrada.txt")) {
                System.err.println("Error: El archivo entrada.txt no existe.");
            } else {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }
}
