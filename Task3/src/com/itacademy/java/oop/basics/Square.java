package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
    }

    public static void validation(Square[] squares){
        for(int i =0; i < squares.length; i++){
            if(squares[i].getWidth() > 0 && squares[i].getLength() > 0){
                System.out.println((i+1) + " square calculations" + squares[i]);
            } else {
                System.out.println((i + 1) + " square has a negative value. Square width equals " + squares[i].getWidth()
                        + ", square length equals " + squares[i].getLength() + "\n") ;
            }
        }

    }

    public static double Perimeter(double length, double width) { return Math.round(((length + width) * 2) * 100.0 ) / 100.0; }

    public static double Area(double length, double width) {
        return Math.round((length * width)*100.0)/100.0;
    }

    public double getLength() { return length; }

    public double getWidth() { return width; }

    @Override
    public String toString() {
        return "{" + '\n' +
                "\t Square length = " + length + '\n' +
                "\t Square width = " + width + '\n' +
                "\t Square perimeter = " + Perimeter(length, width) + '\n' +
                "\t Square area = " + Area(length, width) + '\n' +
                "}\n";
    }

}
