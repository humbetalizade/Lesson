package lesson5;

public class LoopEvenNumber {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<=100){

            if (i%2 ==0){
                sum=sum+i;
            }
        }
        System.out.println("Cut ededlerin cemi:"+sum);
    }
}
