package exercise2;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un precio");
        double price = scanner.nextDouble();
        double priceIva = getPrice(price);
        System.out.println("$"+priceIva);
    }

    static double getPrice(double price) {
        // Porcentaje de iva en argentina
        double iva = (price * 21) / 100;
        return price + iva;
    }
}
