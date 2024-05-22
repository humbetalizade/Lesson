package lesson19;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Include your birthMonth in Azerbaijan:");
        String month=scanner.nextLine();
        if (Objects.equals(month, Month.DECEMBER.getValue())||Objects.equals(month, Month.JANUARY.getValue())||Objects.equals(month, Month.FEBRUARY.getValue())){
            System.out.println("You was born in winter season");
        }else if (Objects.equals(month, Month.MARCH.getValue())||Objects.equals(month, Month.APRIL.getValue())||Objects.equals(month, Month.MAY.getValue())){
            System.out.println("You was born in spring season");
        }else if (Objects.equals(month, Month.JUNE.getValue())||Objects.equals(month, Month.JULY.getValue())||Objects.equals(month, Month.AUGUST.getValue())){
            System.out.println("You was born in summer season");
        }else if (Objects.equals(month, Month.SEPTEMBER.getValue())||Objects.equals(month, Month.OCTOBER.getValue())||Objects.equals(month, Month.NOVEMBER.getValue())){
            System.out.println("You was born in autumn");
        }else{
            System.out.println("You wrote wrong month name");
        }

    }
}
