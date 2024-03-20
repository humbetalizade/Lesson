package lesson4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Imtahanda yigdiniz bali yazin:");
        int a=scanner.nextInt();
        a=(a-1)/10;
        switch (a){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");

        }

    }
}
