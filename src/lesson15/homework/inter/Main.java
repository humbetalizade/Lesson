package lesson15.homework.inter;

public class Main {
    public static void main(String[] args) {
        Resizable r1 = new ResizableRectangle();
        System.out.println("Area of rectangle: " + r1.resize(5, 20));
    }
}
