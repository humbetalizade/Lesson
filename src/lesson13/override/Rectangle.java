package lesson13.override;

public class Rectangle extends Shape{
    @Override
    public int calculateRectangleArea(int a, int b) {
        System.out.println("Also, this method comes from Rectangle");
        return a*b;
    }


    @Override
    public int calculateSecondRectangle(int a, int b) {
        System.out.println("This method works with 'super'");
        return super.calculateSecondRectangle(a, b);
    }
}
