package lesson15.homework.animal;

public class Person implements Swim,Walk{
    @Override
    public void swim() {
        System.out.println("Person swims twice a week");
    }

    @Override
    public void walk() {
        System.out.println("Person walks 5 km everyday");
    }
}
