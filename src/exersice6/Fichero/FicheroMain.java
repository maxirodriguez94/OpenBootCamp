package exersice6.Fichero;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

/*8.Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
 "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro
  "fileIn" al fichero dado en "fileOut".
 */

public class FicheroMain {
    public static void main(String[] args) {
        copyFile("/etc/passwd", "destino.txt");
    }

    public static void copyFile(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
