package lesson13.homework;

public class Bike extends Vehicle{
    private int numWheels;

    public Bike(String make, String model,int numWheels) {
        super(make, model);
        this.numWheels=numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }
}
