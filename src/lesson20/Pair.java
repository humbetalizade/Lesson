package lesson20;

public class Pair <T, U> {
    private T value;
    private U item;

    public T getValue() {
        System.out.println(value);
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }



    public U getItem() {
        System.out.println(item);
        return item;
    }

    public void setItem(U item) {
        this.item = item;
    }
}
