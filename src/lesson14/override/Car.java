package lesson14.override;

public class Car extends Vehicle{
    @Override
    public void Start() {
        System.out.println("This method works from Car class");
    }
}
