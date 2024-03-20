package lesson8.bankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount act=new BankAccount();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Your account number is 154826");
        System.out.println("Your deposit amount is 1200 azn");
        System.out.print("Enter amount which you want to add to balance: ");
        double a=scanner.nextDouble();
        act.deposit(a);
        System.out.print("Enter amount which you want to exit: ");
        double b=scanner.nextDouble();
        act.cashDraw(b);
    }
}
