package lesson14.overloading;

public class ShapeCalculator {
    int side;
    int hight=5;
    static double pi=3.14;
    public int calculator(int sideOne, int sideTwo){
        System.out.println("Area of rectangle:");
        return sideOne*sideTwo;
    }
    public double calculator(double radius){
        System.out.println("Area of circle:");
        return pi*radius*radius;
    }
    public int calculator(int side){
        System.out.println("Area of triangle:");
        return (side*hight)/2;
    }
}
