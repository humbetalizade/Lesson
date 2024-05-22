package lesson15.homework.inter;

public class ResizableRectangle implements Resizable{
    @Override
    public int resize(int height, int bottom) {
        int area=height*bottom/2;
        System.out.println("This method comes from ResizableRectangle");
        return area;
    }
}
