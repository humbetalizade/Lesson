package lesson3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please include a number:");
        int number= scanner.nextInt();
        if (number>10){
            System.out.print(-number + "->The number you entered bigger than ten");
        }
        else{
            System.out.print(number + "->The number you entered smaller than ten");
        }

        if (number%2==0){
            System.out.println(" and even.");
        }
        else {
            System.out.println(" and single.");
        }
        System.out.print("Please include the decimale:");
        int onlug= scanner.nextInt();
        int sum = onlug + number;
        int random = (int) (Math.random() * 6 + 1);
        int finalNum = sum + random;
        System.out.println("Final digit:" + finalNum);
            if (finalNum>20) {
                System.out.println("It's larger than 20.");
            }
            else if (finalNum<20){
                System.out.println("It's smaller than 20.");
            }
            else {
                System.out.println("It's equal to 20.");
            }
        }
    }
