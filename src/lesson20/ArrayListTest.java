package lesson20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Watermelon");
        for (String item: fruits){
            System.out.println(item);
        }

    }
}
