package exersice6.Program;

public class Person {

    private int id;

    private String name;

    private double tall;


    public Person(int id, String name, double tall) {
        this.id = id;
        this.name = name;
        this.tall = tall;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTall() {
        return tall;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tall=" + tall +
                '}';
    }
}
