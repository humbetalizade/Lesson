package lesson8.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Type numbers = new Type();
        System.out.println("Sum of numbers: " + numbers.calculate(12,18));
        numbers.calculate(78,155);
        System.out.println("Average of numbers: " + numbers.average(15,24));
        System.out.println("Sum of array's numbers: "+ numbers.array());
        numbers.even(24);
    }
}
