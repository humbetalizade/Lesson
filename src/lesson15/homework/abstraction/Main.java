package lesson15.homework.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape c1=new Circle();
        System.out.println("Area of Circle:"+c1.calculateArea());
        Shape sq1=new Square();
        System.out.println("Area of Square:"+sq1.calculateArea());

    }
}
