package lesson2;

public class Variable {
    public static void main(String[] args) {
        String name = "Ugur";
        double number3 = 5.6;
        char parklanmaIsaresi = 'P';
        boolean check1 = true;
        boolean check2 = false;

        int number1 = 45;
        int number2 = 4;

        int sum = number1 + number2;
        int subtract = number1 - number2;
        int multiply = number1 * number2;
        double division = number1 / number2;
        int remainder = number1 % number2;

        System.out.println(number1/number2);


        System.out.println("Cem : " + sum);
        System.out.println("Ferq : " + subtract);
        System.out.println("Vurma " + multiply );
        System.out.println("Bolme "+ division);
        System.out.println("Qaliq " + remainder);


        int a = 12;

        a++;

        System.out.println(a--);

        System.out.println(a);
    }
}
