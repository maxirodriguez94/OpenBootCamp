package exersice6.Error;

import java.util.Scanner;
/*7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
 a su llamante del tipo ArithmeticException que será capturada por su llamante
 (desde "main", por ejemplo). Si se dispara la excepción,
 mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
*/
public class ErrorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 2 numeros");

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        try {
            System.out.println("Resultado = " + dividePorCero(numberA,numberB));

        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }

    }

    public static int dividePorCero(int numberA, int numberB){
        int result = 0;

        try{
            result = numberA / numberB;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        return result;
    }
}
