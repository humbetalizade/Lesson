package lesson15.text;

import java.util.Scanner;

public class Message {
    public void information() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        String rewrite = "";
        char[] symbols = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            symbols[i] = text.charAt(text.length() - (i + 1));
            String textNew = String.valueOf(symbols[i]);
            rewrite = rewrite.concat(textNew);
        }
        System.out.print(rewrite);
    }
}
