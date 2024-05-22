package lesson20;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> test=new HashSet<>();
        test.add("Gazanfar");
        test.add("Gozal");
        test.add("Humbat");
        test.add("Zulfiyya");
        test.add("Fuad");
        System.out.println(test);
    }
}