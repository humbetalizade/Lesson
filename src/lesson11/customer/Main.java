package lesson11.customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a = scanner.nextLine();

        System.out.println("Enter your surname:");
        String b = scanner.nextLine();

        User user1 = new User(a, b);
        System.out.println(user1.name + " " + user1.surName);

    }
}
