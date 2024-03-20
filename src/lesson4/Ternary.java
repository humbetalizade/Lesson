package lesson4;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imtahan balinizi yazin: ");
        int a = scanner.nextInt();
        String b = (a<1 || a>100) ? "Daxil etdiyiniz eded sehvdir" :(a<51) ? "Imtahandan kesildiniz" :(a < 61) ? "E" : (a < 71) ? "D" : (a < 81) ? "C" :
                (a < 91) ? "B" : "A";
        System.out.println(b);
    }
}
