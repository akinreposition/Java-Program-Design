package oopChallenge;

public class Car extends Vehicle {
    private String colour;
    private String name;
    private String make;

    public Car(int size, int tyres, int doors) {
        super(size, tyres, doors);
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }
}
