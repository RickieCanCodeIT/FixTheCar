import java.util.Random;

public class Vehicle {
    private int numberOfWheels;
    private double speed;
    private int fuel;
    private boolean flatTire;
    private double distanceTravelled;
    private String name;

    public Vehicle(int numberOfWheels, double speed, int fuel, String name) {
        this.numberOfWheels = numberOfWheels;
        this.fuel = fuel;
        this.flatTire = false;
        this.name = name;
        this.distanceTravelled = 0;
    }

    public void move() {
        fuel--;
        if (flatTire) {
            flatTire = false;
            System.out.println(name + " has travelled " + distanceTravelled + " feet.");
        }
        else {
            distanceTravelled += speed;
            System.out.println(name + " has travelled " + distanceTravelled + " feet.");
            for (int i = 1; i < numberOfWheels; i++) {
                if (Math.floor(Math.random() * 12) == 0 ) {
                    flatTire = true;
                    System.out.println(name + " has a flat tire.");
                    break;
                }
            }
        }
    }

    public boolean canMove() {
        if (fuel > 0) {
            return true;
        }
        else {
            System.out.println(name + " is out of gas.");
            return false;
        }
    }
}
