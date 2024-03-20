package lesson5;

public class LoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
                System.out.println(i);
        }
    }
}
