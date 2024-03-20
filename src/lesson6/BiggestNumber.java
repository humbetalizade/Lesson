package lesson6;

public class BiggestNumber {
    public static void main(String[] args) {
        int biggestNum=1;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            if (array[i]>=biggestNum){
                biggestNum=array[i];
            }
        }
        System.out.println("Big number is "+biggestNum);

    }
}
