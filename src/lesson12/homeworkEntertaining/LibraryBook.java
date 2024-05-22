package lesson12.homeworkEntertaining;

public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut=false;

    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public void checkOut(){
        if (!checkedOut){
            checkedOut=true;
            System.out.println("kitab goturuldu");
        }
        else System.out.println("kitab yoxdur");

    }
    public void returnBook(){
        if (checkedOut){
            checkedOut=false;
            System.out.println("kitab qaytarildi");
        }
        else System.out.println("kitab qaytarilmayib");
    }
    public boolean isAvailable(){
        return !checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
