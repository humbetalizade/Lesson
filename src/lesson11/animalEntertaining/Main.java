package lesson11.animalEntertaining;

public class Main {
    public static void main(String[] args) {

        Animal animal=new Animal("Lion", "Barbary Lion",2);
        Feeder feeder=new Feeder();
        Trainer trainer=new Trainer();

        feeder.prepareMeal("Meat",animal);
        trainer.teachTrick("flip",animal);
        animal.makeSound();
        //animal.getTotalVisitors();
        System.out.println("Counts of visitors:        "+animal.getTotalVisitors());

    }
}
