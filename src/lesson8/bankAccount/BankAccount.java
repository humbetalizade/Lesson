package lesson8.bankAccount;

public class BankAccount {
    int accountNumber=154826;
    double balance=1200;

    public void deposit(double amount) {

        System.out.println("Your finally balance is "+(balance+amount));
    }
    public void cashDraw (double amount){
        if (balance>=amount){
            System.out.println("Your new balance is "+(balance-amount));
        }
        else {
            System.out.println("You don't have enough money");
        }
    }
}
