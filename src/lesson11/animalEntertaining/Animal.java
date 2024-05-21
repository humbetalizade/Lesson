package lesson11.animalEntertaining;

public class Animal {
    String name;
    String species;
    int age;
    static int totalVisitors;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        totalVisitors++;
    }

    public void makeSound() {
        System.out.println(name + " make a voice");
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }
}
