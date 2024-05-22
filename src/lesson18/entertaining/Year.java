package lesson18.entertaining;

import java.time.LocalDate;

public class Year {
    public static void main(String[] args) {
        //Length of String
        String example="This text is for example";
        System.out.println(example.length());




        //How to get current year with StringBuilder method
        StringBuilder text = new StringBuilder();
        int year = LocalDate.now().getYear();
        text.append(year);
        System.out.println("Current year is "+text);





        //Threats in StringBuffer
        StringBuffer title=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            title.append("a");
            System.out.println(title);
        }

        StringBuffer title2=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            title2.append("b");
            System.out.println(title2);
        }

    }
}
