package lesson13.override;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Include radius of circle and sides of rectangle");
        int radius = scanner.nextInt();
        int sideOne = scanner.nextInt();
        int sideTwo = scanner.nextInt();
        System.out.println("Area of Circle " + circle.calculateCircleArea(radius));
        System.out.println("Area of Rectangle " + rectangle.calculateRectangleArea(sideOne, sideTwo));
        System.out.println("Result of second rectangle: "+rectangle.calculateSecondRectangle(5,5));

    }
}
