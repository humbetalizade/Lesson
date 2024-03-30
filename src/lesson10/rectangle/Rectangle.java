package lesson10.rectangle;

public class Rectangle {
    int width;
    int lenght;
    public int calculateArea(int width, int lenght){
        return width*lenght;
    }
    public int calculatePerimetr(int width, int lenght){
        return (width+lenght)*2;
    }
}
