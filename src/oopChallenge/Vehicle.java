package oopChallenge;

public class Vehicle {
    private int size;
    private  int tyres;
    private int doors;

    public Vehicle(int size, int tyres, int doors) {
        this.size = size;
        this.tyres = tyres;
        this.doors = doors;
    }

    public int getSize() {
        return size;
    }

    public int getTyres() {
        return tyres;
    }

    public int getDoors() {
        return doors;
    }

    public void move(int speed){
        System.out.println("vehicle.move() called!");
    }
    public void reverse(){
        System.out.println("vehicle is reversing.");
    }
}
