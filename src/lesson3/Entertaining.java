package lesson3;

import java.util.Scanner;

public class Entertaining {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dovrlerin sayini mueyyen edin:");
        int a=scanner.nextInt();
        int random= (int) (Math.random()*10+1);
        System.out.print("Zehmet olmazsa, ededi daxil edin:");
        for (int i = 0; i < a; i++) {
            int texmin=scanner.nextInt();
            if (random>texmin){
                System.out.println("Yuxari");
                System.out.print("Basqa eded daxil edin:");
            }
            else if (random<texmin) {
                System.out.println("Asagi");
                System.out.print("Basqa eded daxil edin:");
            }
            else {
                System.out.println("Daxil etdiyiniz eded dogrudur." + random);
                break;
            }

        }
    }
}
