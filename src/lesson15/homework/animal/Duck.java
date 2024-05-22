package lesson15.homework.animal;

public class Duck implements Fly,Swim,Walk{
    @Override
    public void fly() {
        System.out.println("Duck flies 20 metres");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims 2 hours a day");
    }

    @Override
    public void walk() {
        System.out.println("Duck walks after lunch");
    }
}