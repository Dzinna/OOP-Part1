package com.itacademy.java.oop.basics;

public class ShapeApplication {


    public static void main(String[] args) {
        Square squareOne = new Square(12.00, 12.00);
        Square squareTwo = new Square(-4.40, -4.40);
        Square squareThree = new Square(5.20, 5.20);

        Square[] squares = {squareOne, squareTwo, squareThree};
        Square.validation(squares);

    }
}
