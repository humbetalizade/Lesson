package lesson14.override;

public class Motorcycle extends Vehicle{
    @Override
    public void Start() {
        System.out.println("This method works from Motorcycle class");
    }
}
