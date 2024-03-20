package lesson6;

import java.util.Scanner;

public class Entertaining {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 10 items:");
        String[] array= new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextLine();
        }
        for (String items:array){
            System.out.println(items);
        }


    }
}
