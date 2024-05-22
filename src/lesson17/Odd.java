package lesson17;

public class Odd extends Thread {

    @Override
    public void run() {

        for (int i = 1; i < 100; i+=2) {
            System.out.println("Odd "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
