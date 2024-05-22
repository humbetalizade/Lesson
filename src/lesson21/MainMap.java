package lesson21;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map h1 = new HashMap();
        System.out.println("How many contact would you like to add to list");
        int count=scanner.nextInt();
        for (int i = 1; i < count; i++) {
            System.out.println("Enter new contact");
            long contact = scanner.nextLong();
            System.out.println("Enter new name");
            String name = scanner.nextLine();
            h1.put(0, name);
        }
        System.out.println(h1);

    }
}
