package exersice6.Program;

import java.io.PrintWriter;
import java.util.*;

/*
 * Sorpréndenos creando un programa de tu elección que utilice InputStream,
 * PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */


public class Main {
    public static void main(String arg[]) {
        Object list = createArrayList();
        HashMap<String, Integer> map = convertArrayListToHashMap((List<Person>) list);
        copyFile(map);
    }

    private static Object createArrayList() {
        List<Person> list = new ArrayList<Person>();

        Random numberRandom = new Random();

        Person temp = null;

        int sumTall = 0;

        for (int i = 0; i < 1000; i++) {
            list.add(new Person(i, "Persona" + i, numberRandom.nextInt(100) + 100));
        }

        Iterator<Person> it = list.iterator();


        while (it.hasNext()) {

            temp = it.next();

            System.out.println(temp);

            sumTall += temp.getTall();

        }

        System.out.println("La media de altura del conjunto de Personas es: " + sumTall / list.size());

        return list;
    }


    private static HashMap<String, Integer>
    convertArrayListToHashMap(List<Person> arrayList) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (Person str : arrayList) {

            hashMap.put(str.getName(), (int) str.getTall());
        }

        return hashMap;
    }

    public static void copyFile(HashMap<String, Integer> map) {
        try {
            PrintWriter writer = new PrintWriter("filename.txt");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.println(entry.getKey() + " altura =  "
                        + entry.getValue());
                System.out.println(entry.getKey() + " altura =  "
                        + entry.getValue());
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
    


