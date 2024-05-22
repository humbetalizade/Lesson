package lesson15.homework.abstraction;

public class Circle extends Shape {

    final double pi=3.14;
    int radius=10;

    @Override
    double calculateArea() {
        double area=radius*radius*pi;

        return area;
    }

}
