package exercise4;

public class SmartWatch extends SmartDevice{

    boolean waterproof;

    public SmartWatch() {
    }

    public SmartWatch(String colour, String model, boolean bluetooth, int ramMemory, boolean waterproof) {
        super(colour, model, bluetooth, ramMemory);
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "waterproof=" + waterproof +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth=" + bluetooth +
                ", ramMemory=" + ramMemory +
                '}';
    }
}
