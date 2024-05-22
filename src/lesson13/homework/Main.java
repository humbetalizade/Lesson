package lesson13.homework;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Ferrari", "296 GTB");
        Car car = new Car("Ford", "Mustang", 2);
        Bike bike = new Bike("Scott", "Spark", 2);

        System.out.println(car.getMake() + " " + car.getModel());
        System.out.println("counts of doors: " + car.getNumDoors() + "\n");

        System.out.println(vehicle1.getMake() + " " + vehicle1.getModel() + "\n");

        System.out.println(bike.getMake() + " " + bike.getModel());
        System.out.println("counts of wheels: " + bike.getNumWheels());
    }
}
