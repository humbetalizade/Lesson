package lesson13.override;

public class Circle extends Shape{
    @Override
    public double calculateCircleArea(int a) {
        System.out.println("This method comes from Circle");
        return a*a*pi;
    }
}
