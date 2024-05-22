package lesson20;

public class Main {
    public static void main(String[] args) {
        Pair <String,String> test = new <String> Pair();
        test.setValue("This method appear to us");
        test.setItem("This method isn't appear to us");
        test.getValue();
        test.getItem();
    }
}
