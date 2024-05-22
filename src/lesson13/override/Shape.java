package lesson13.override;

public class Shape {
    static double pi=3.14;
    public double calculateCircleArea(int a){
        System.out.println("This method comes from Shape");
        double area=a*a*a*pi*6;
        return area;
    }
    public int calculateRectangleArea(int a, int b){
        System.out.println("This method comes from Shape");
        int area=a*b*2;
        return area;
    }


    public int calculateSecondRectangle(int a, int b){
        int area=a*a*b;
        return area;
    }
}
