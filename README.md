# Gestión de Procesos 3.1

Este proyecto contiene tres pequeñas aplicaciones Java que trabajan con archivos de texto y flujo de entrada/salida.  
Cada aplicación está empaquetada en su propio **.jar ejecutable** mediante Maven.

## 📂 Aplicaciones incluidas

### 1. 📖 lectorTexto
Lee el contenido de un archivo `entrada.txt` ubicado en los recursos del proyecto y lo muestra en la salida estándar (stdout).

- **Uso:**
  ```bash
  java -jar lectorTexto.jar
Comportamiento:

Si el archivo existe, imprime su contenido línea por línea.

Si no existe, muestra el error:

yaml
Copiar código
Error: El archivo entrada.txt no existe.
### 2. ✂️ filtraLineas
Lee líneas de texto desde la entrada estándar (stdin) y muestra únicamente aquellas que contengan más de 20 caracteres.

Uso:

bash
Copiar código
java -jar filtraLineas.jar
Ejemplo encadenado con tuberías:

bash
Copiar código
cat archivo.txt | java -jar filtraLineas.jar
Comportamiento:

Solo imprime las líneas que tengan más de 20 caracteres.

Útil para filtrar datos antes de pasarlos a otra aplicación.

### 3. 🔢 contadorPalabras
Cuenta el número total de palabras en la entrada estándar y muestra el resultado en la salida estándar.

Uso:

bash
Copiar código
java -jar contadorPalabras.jar
Ejemplo encadenado con otras apps:

bash
Copiar código
cat archivo.txt | java -jar contadorPalabras.jar
Comportamiento:

Divide las líneas en palabras por espacios (split("\\s+")).

Imprime el total de palabras leídas:

yaml
Copiar código
Número total de palabras: 42
## ⚙️ Construcción con Maven
Cada aplicación tiene su propio pom.xml configurado para generar un .jar independiente con su mainClass:

lectorTexto → org.example.lectorTexto

filtraLineas → org.example.filtraLineas

contadorPalabras → org.example.contadorPalabras

Compilación
En la raíz de cada proyecto:

bash
Copiar código
mvn clean package
Esto generará un archivo .jar en la carpeta target/.

## 🖥️ Ejemplo de uso combinado
Se pueden encadenar las aplicaciones usando tuberías (|), por ejemplo:

bash
Copiar código
cat entrada.txt | java -jar filtraLineas.jar | java -jar contadorPalabras.jar
🔗 Este comando:

Lee entrada.txt.

Filtra solo las líneas con más de 20 caracteres.

Cuenta el total de palabras resultantes.

## 📸 Capturas de ejemplo
lectorTexto
yaml
Copiar código
Contenido de entrada.txt:
Hola mundo
Esta es una prueba
filtraLineas
scss
Copiar código
(Entrada)
Hola
Este es un ejemplo de línea con más de 20 caracteres
(Salida)
Este es un ejemplo de línea con más de 20 caracteres
contadorPalabras
vbnet
Copiar código
Entrada: "Hola mundo desde Java"
Salida: Número total de palabras: 4
![Ejemplo](ACFF39A7-5FBE-431D-BAE7-99007C44E68C.png)
)
## 🛠️ Dependencias
Java 8+

Maven 3+

JUnit 3.8.1 (solo para pruebas)
