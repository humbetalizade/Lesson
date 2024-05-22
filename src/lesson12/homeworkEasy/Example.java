package lesson12.homeworkEasy;

import java.util.Objects;

public class Example {
    private String name;
    private String surName;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return age == example.age && Objects.equals(name, example.name) && Objects.equals(surName, example.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }
}
