package lesson11.customer;

public class User {
    String name;
    String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public void Text(){
        System.out.println(this.name.concat(" "+this.surName));
    }
}
