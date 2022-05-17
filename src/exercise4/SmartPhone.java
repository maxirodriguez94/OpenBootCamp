package exercise4;

public class SmartPhone extends SmartDevice{

    int pixelCamera;
    double high;
    double wide;

    public SmartPhone(){
    }

    public SmartPhone(String colour, String model, boolean bluetooth, int ramMemory, int pixelCamera, double high, double wide) {
        super(colour, model, bluetooth, ramMemory);
        this.pixelCamera = pixelCamera;
        this.high = high;
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pixelCamera=" + pixelCamera +
                ", high=" + high +
                ", wide=" + wide +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth=" + bluetooth +
                ", ramMemory=" + ramMemory +
                '}';
    }
}
