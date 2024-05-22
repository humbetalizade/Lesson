package lesson17;

public class Even extends Thread{

    @Override
    public void run() {
        for (int i = 2; i < 100; i+=2) {
            System.out.println("Even "+i);
        }



    }
}
