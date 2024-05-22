package lesson15.homework.abstraction;

import lesson15.homework.abstraction.Shape;

public class Square extends Shape {
    final int sideOne=5;
    final int sideTwo=10;
    @Override
    double calculateArea() {
        return sideOne*sideTwo;
    }


}
