package lesson11.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Q8");
        Car car2 = new Car("Hyundai", "Santafe");

        System.out.println(car1.brand + " " + car1.model);
        System.out.println(car2.brand + " " + car2.model);
    }
}
