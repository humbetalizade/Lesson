package lesson10.students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter student's grade: ");
        int a=scanner.nextInt();
        System.out.println(student.name);
        System.out.println(student.age);
        student.getGrade(a);
    }
}
