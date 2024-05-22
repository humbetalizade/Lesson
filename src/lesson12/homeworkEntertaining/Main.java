package lesson12.homeworkEntertaining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryBook l1 = new LibraryBook("1984", "George Orwell", 1968);
        LibraryBook l2 = new LibraryBook("Necə ölməməli", "Maykl Qreger", 2017);
        LibraryBook l3 = new LibraryBook("Cəld və yavaş düşünmək", "Daniel Kaneman", 2009);
        LibraryBook l4 = new LibraryBook("Bəs niyə səma mavidir?", "Erik Mative", 2005);



        l2.checkOut();
        System.out.println("kitab elcatandir mi? "+l2.isAvailable());
        l2.returnBook();
        System.out.println("kitab hele de elcatandir mi? "+l2.isAvailable());



    }
}
