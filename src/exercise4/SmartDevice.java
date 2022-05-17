package exercise4;

public class SmartDevice {

    protected String colour;
    protected String model;
    protected boolean bluetooth;
    protected int ramMemory;

    public SmartDevice(){
    }

    public SmartDevice(String colour, String model, boolean bluetooth, int ramMemory) {
        this.colour = colour;
        this.model = model;
        this.bluetooth = bluetooth;
        this.ramMemory = ramMemory;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth=" + bluetooth +
                ", ramMemory=" + ramMemory +
                '}';
    }
}
