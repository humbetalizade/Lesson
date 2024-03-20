package lesson9;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Author author=new Author("George Orwell",1945);
        Book book = new Book("1984",author,1986);
        System.out.println(author);
        System.out.println(book);
    }
}
