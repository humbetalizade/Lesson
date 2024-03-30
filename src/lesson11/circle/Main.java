package lesson11.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //CONSTRUCTOR
        System.out.print("Enter radius of circle: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle is " + circle.area);


        //METHOD
        System.out.print("Enter radius of circle for method: ");
        int radius2 = scanner.nextInt();
        Circle circle2 = new Circle(radius2);
        System.out.println("Area of circle with method: " + circle2.getArea(radius2));
    }
}
