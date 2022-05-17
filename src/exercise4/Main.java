package exercise4;

public class Main {
    public static void main(String[] args){

        SmartDevice smartDevice = new SmartDevice("Black", "Xiaomi", true, 16);
        System.out.println(smartDevice);

        SmartDevice smartDevice2 = new SmartDevice();
        smartDevice2.model = "Nokia";
        System.out.println(smartDevice2);

        SmartPhone redmi10 = new SmartPhone("Blue","Redmi 10", true, 8, 45, 8.8, 5.2);
        System.out.println(redmi10);

        SmartPhone redmi11 = new SmartPhone();
        redmi11.pixelCamera = 56;
        System.out.println(redmi11);

        SmartWatch T99s = new SmartWatch("Black", "T99s", true, 4, false);
        System.out.println(T99s);

        SmartWatch DT100 = new SmartWatch();
        DT100.colour = "Pink";
        System.out.println(DT100);

    }
}
