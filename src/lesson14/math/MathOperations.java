package lesson14.math;

public class MathOperations {
    private int number1;
    private int number2;

    public void operations(int number1,int number2) {
        System.out.println("Sum of numbers:"+number1 + "+" + number2 + "=" + (number1 + number2));
    }
    public void operations(int number1,float number2) {
        System.out.println("Subtract of numbers:"+number1 + "-" + number2 + "=" + (number1 - number2));
    }
    public void operations(int number1,double number2) {
        System.out.println("Multiply of numbers:"+number1 + "*" + number2 + "=" + (number1 * number2));
    }
    public void operations(double number1,double number2) {
        System.out.println("Divide of numbers:"+number1 + "/" + number2 + "=" + (number1 / number2));
    }

}
