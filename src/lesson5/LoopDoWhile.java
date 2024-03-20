package lesson5;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Include your secret number: ");
        int secretNumber = scanner.nextInt();
        int customerNumber;
        boolean cong = true;
        do {
            System.out.print("Estimate a number: ");
            customerNumber = scanner.nextInt();
            if (secretNumber > customerNumber) {
                System.out.println("Secret number is higher than your number");
            } else if (customerNumber > secretNumber) {
                System.out.println("Secret number is lower than your number");
            } else {
                cong = false;
            }
        }
        while (cong);
        System.out.println("Congratulations");
    }
}

