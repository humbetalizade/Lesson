package lesson14.math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathOperations math1= new MathOperations();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter numbers for Sum");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        math1.operations(num1,num2);

        System.out.println("Enter numbers for Subtract");
        int num3=scanner.nextInt();
        float num4=scanner.nextInt();
        math1.operations(num3,num4);

        System.out.println("Enter numbers for Multiply");
        int num5=scanner.nextInt();
        double num6=scanner.nextInt();
        math1.operations(num5,num6);

        System.out.println("Enter numbers for Divide");
        double num7=scanner.nextInt();
        double num8=scanner.nextInt();
        math1.operations(num7,num8);

    }
}
