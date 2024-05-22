package lesson14.override;

public class Main {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.Start();
        Car c1=new Car();
        c1.Start();
        Motorcycle m1=new Motorcycle();
        m1.Start();
    }
}
