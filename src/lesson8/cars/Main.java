package lesson8.cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car cars = new Car();
        System.out.print("Enter make of the car: ");
        cars.make = scanner.nextLine();
        System.out.print("Enter model of the car: ");
        cars.model = scanner.nextLine();
        System.out.print("Enter make of the car: ");
        cars.year = scanner.nextInt();
        System.out.print(cars.make + " ");
        System.out.print(cars.model + " ");
        System.out.print(cars.year);

    }
}
