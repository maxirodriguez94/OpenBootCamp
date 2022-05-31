package exersice6.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        /*5.Crea un ArrayList de tipo String, con 4 elementos.
         Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> names = new ArrayList<String>();
        names.add("Jorge");
        names.add("Maxi");
        names.add("Raul");
        names.add("Jose");

        LinkedList<String> namesLinkedList = new LinkedList<String>(names);

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : namesLinkedList) {
            System.out.println(name);
        }

        /*
        6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        List<Integer> toRemove = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }

        for (Integer number : numbers) {

            if (number % 2 == 0) {
                toRemove.add(number);
            }

        }
        numbers.removeAll(toRemove);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
