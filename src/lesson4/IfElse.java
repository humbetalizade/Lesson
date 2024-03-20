package lesson4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Balinizi qeyd edin:");
        int a= scanner.nextInt();
        if (a<1 || a>101){
            System.out.println("Dogru eded daxil edin!!!");
        }
        else if (a>90){
            System.out.println("Balinizin herf qarsiligi A-dir");
        }
        else if (a>80){
            System.out.println("Balinizin herf qarsiligi B-dir");
        }
        else if (a>70){
            System.out.println("Balinizin herf qarsiligi C-dir");
        }
        else if (a>60){
            System.out.println("Balinizin herf qarsiligi D-dir");
        }
        else if (a>50){
            System.out.println("Balinizin herf qarsiligi E-dir");
        }
        else {
            System.out.println("Imtahandan kesildiniz");
        }

    }
}
