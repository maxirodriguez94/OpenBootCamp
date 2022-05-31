package exersice6.String;

public class StringMain {
    /*
   Escribe el código que devuelva una cadena al revés. Por ejemplo,
    la cadena "hola mundo", debe retornar "odnum aloh".
   */

    public static void main(String[] args) {
        String string = "Hola Mundo";

        for (int i = string.length() - 1; i > 0; i--) {
            System.out.println(string.charAt(i));
        }
    }
}
