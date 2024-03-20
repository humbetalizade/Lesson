package lesson6;

public class Array {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 6, 7, 84, 23, 11, 67, 44};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for (int items : array) {
            System.out.println(items);
        }



        int[] massiv = new int[5];
        massiv[0] = 1;
        massiv[1] = 5;
        massiv[2] = 8;
        massiv[3] = 6;
        massiv[4] = 12;
    }
}
