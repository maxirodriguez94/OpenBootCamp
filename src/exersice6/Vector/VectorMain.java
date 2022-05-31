package exersice6.Vector;

import java.util.Vector;

public class VectorMain {
    /*
    1.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
     Elimina el 2o y 3er elemento y muestra el resultado final.
    */

    public static void main(String[] args){
        Vector <String> names = new Vector();
        names.add("Jorge");
        names.add("Maxi");
        names.add("Raul");
        names.add("Jose");
        names.add("Maxwel");

        names.remove(1);
        names.remove(2);

        for(String name : names){
            System.out.println(name);
        }
    }

    /*
    * 4.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
    *  si tuviésemos 1000 elementos para ser añadidos al mismo.*/
    /*
    Altos costos por producción y mantenimiento •Mayor dificultad a la hora de escribir programas
    */
}
