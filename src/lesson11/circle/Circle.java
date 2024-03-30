package lesson11.circle;

public class Circle {
    static double pi=3.14;
    int r;
    double area;

    public Circle(int r) {
        this.r = r;
        this.area=pi*r*r;
    }
    public double getArea(int r){
        return pi*r*r;
    }
}
