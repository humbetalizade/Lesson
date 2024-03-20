package lesson8.prim;

public class Main {
    public static void main(String[] args) {
        Primitive guest = new Primitive();
        double sum = guest.b + guest.c;
        System.out.print("Sum of numbers: ");
        System.out.println(sum);
        System.out.println("Collect String and Char: " + guest.a + guest.d);
    }
}


