package lesson22.homework1;

import lesson22.homework1.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        list.add((new Book("Nikolo Makiavelli","Hökmdar",12)));
        list.add((new Book("Əli Əkbər","Gilə",7)));
        list.add((new Book("Martin Page","Yazı vı yaşam kitabı",9)));

        Collections.sort(list);
        for (Book book:list){
            System.out.println(book);
        }

    }
}
