package lesson9;

public class Author {
    String name;
    int birthdayYear;

    public Author(String name, int year) {
        this.name = name;
        this.birthdayYear = year;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", year=" + birthdayYear +
                '}';
    }
}
