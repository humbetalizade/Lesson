package lesson22.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Humbet",24,68));
        list.add(new Student("Dayanat",25,70));
        list.add(new Student("Ilkin",27,92));
        list.add(new Student("Cavid",25,84));
        list.add(new Student("Parviz",22,67));
        list.add(new Student("Punhan",26,75));



        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Student student:list){
            System.out.println(student);
        }
    }
}
