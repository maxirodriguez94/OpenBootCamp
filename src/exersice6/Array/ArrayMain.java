package exersice6.Array;

public class ArrayMain {
    public static void main(String[] args) {
        /*
        1.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        */

        String[] arrays =
                {
                        "Ejercicio",
                        "De",
                        "Array",
                        "Realizado"
                };

        for (String data : arrays) {
            System.out.println(data);
        }

        /*
        *2.Crea un array bidimensional de enteros y recórrelo,
          mostrando la posición y el valor de cada elemento en ambas dimensiones.
        */
        int[][] array2 =
                {
                        {1, 2, 3},
                        {10, 20, 30}
                };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("estoy en i = " + i + ",j = " + j + " Valor " + array2[i][j]);
            }
        }
    }

}
