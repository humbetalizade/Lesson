package lesson2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //calculator with INT
//        System.out.print("Birinci ededi daxil edin:");
//        int number1= scanner.nextInt();
//        System.out.print("Ikinci ededi daxil edin:");
//        int number2= scanner.nextInt();
//        int sum=number1+number2;
//        int subtract=number2-number1;
//        int multiply=number1*number2;
//        int divide=number1/number2;
//        System.out.println("Cem: "+sum);
//        System.out.println("Ferq: "+subtract);
//        System.out.println("Hasil: "+multiply);
//        System.out.println("Bolme: "+divide);


        //calculator with DOUBLE
        System.out.print("Birinci ededi daxil edin:");
        double number1= scanner.nextDouble();
        System.out.print("Ikinci ededi daxil edin:");
        double number2= scanner.nextDouble();
        double sum=number1+number2;
        double subtract=number2-number1;
        double multiply=number1*number2;
        double divide=number1/number2;
        System.out.println("Cem: "+sum);
        System.out.println("Ferq: "+subtract);
        System.out.println("Hasil: "+multiply);
        System.out.println("Bolme: "+divide);




    }
}
