package lesson8.method;

public class Type {
    public int calculate(int a, int b){
        return a+b;
    }
    public double average(int a, int b){

        return (a+b)/2;
    }
    public int array(){
        int[] a={1,5,8,7,9};
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public void even(int evenNumber){
        if (evenNumber%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is single");
        }
    }
}
