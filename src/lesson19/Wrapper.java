package lesson19;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers of int type");

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        Integer newFirstNumber = firstNumber;
        Integer newsecondNumber = secondNumber;

        Integer sum = newFirstNumber + newsecondNumber;
        System.out.println("Sum of two numbers of Integer type: " + sum);
    }
}
