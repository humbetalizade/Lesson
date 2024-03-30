package lesson10.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter width of rectangle: ");
        rectangle.width= scanner.nextInt();

        System.out.print("Enter length of rectangle: ");
        rectangle.lenght=scanner.nextInt();


        System.out.println("Area of rectangle is "+rectangle.calculateArea(rectangle.width, rectangle.lenght));
        System.out.println("Perimetr of rectangle is "+rectangle.calculatePerimetr(rectangle.width, rectangle.lenght));
    }
}
