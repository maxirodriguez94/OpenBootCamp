package type;

import java.util.ArrayList;
import java.util.List;

public class TypeMain {

    public static void main(String[] args)
    {
        List<String> types = new ArrayList<String>();

        types.add("byte number1 = 1;");
        types.add("short number2 = 2;");
        types.add("int number3 = 3;");
        types.add("long number4 = 4;");
        types.add("loat decimal = 4.1f;");
        types.add("double decimal2 = 9.99d;");
        types.add("char caracter1 = 'a';");
        types.add("boolean verdadero = true;");
        types.add("boolean falso = false;");
        types.add("String name = \"Maxi\"");
        types.add("String apellido = \"Rodrigez\";");
        types.add("Integer numero = null;");
        types.add("Long numero2 = 2L;");

        for(String type : types){
            System.out.println(type);
        }
    }
}
