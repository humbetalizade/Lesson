package lesson14.overloading;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shape1= new ShapeCalculator();
        System.out.println(shape1.calculator(5));
        System.out.println(shape1.calculator(10, 6));
        System.out.println(shape1.calculator(3.9));
    }
}
