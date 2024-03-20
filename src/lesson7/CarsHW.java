package lesson7;

import java.util.Scanner;

public class CarsHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cars = new String[3][3];

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter the numbers consistently: ");
            for (int j = 0; j < cars.length; j++) {
                cars[i][j] = scanner.nextLine();
            }
        }
        for (String[] items : cars) {
            for (String inc : items) {
                System.out.print(" " + inc + " ");
            }
            System.out.println();
        }
    }
}

