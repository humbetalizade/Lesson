package lesson16.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Participant {
    String name;
    int age;
    String email;
    FileReader file=new FileReader("participants.txt");

    public Participant() throws FileNotFoundException {
    }

    public Participant(String name, int age, String email, FileReader file) throws FileNotFoundException {
        this.name = name;
        this.age = age;
        this.email = email;
        this.file = file;
    }
}
