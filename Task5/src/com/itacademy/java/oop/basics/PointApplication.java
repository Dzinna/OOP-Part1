package com.itacademy.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        MyPoint myPointOne = new MyPoint(4,8);
        MyPoint myPointTwo = new MyPoint(2,5);

        System.out.println("First point coordinates (x, y): " + myPointOne);
        System.out.println("Second point coordinates (x, y): " + myPointTwo + "\n");

        System.out.println("Distance from point One to the given: " + myPointOne.distance(7, 9));
        System.out.println("Distance from point Two to the given: " + myPointTwo.distance(6, 2)  + "\n");

        System.out.println("Distance from point One to point Two: " + myPointOne.distance(myPointTwo)  + "\n");

        System.out.println("Distance from point One to (0, 0): " + myPointOne.distance());
        System.out.println("Distance from point Two to (0, 0): " + myPointTwo.distance()  + "\n");

        myPointOne.setX(10);
        System.out.println("Point One X: " + myPointOne.getX());
        myPointTwo.setY(1);
        System.out.println("Point Two Y: " + myPointTwo.getY() + "\n");

        myPointTwo.setXY(5, 5);
        int[] secondPointArray = myPointTwo.getXY();
        System.out.println("Point Two X, Y: " + secondPointArray[0] + ", " + secondPointArray[1]);

        int[] firstPointArray = myPointOne.getXY();
        System.out.println("Point One X, Y: ");
        for (int i:firstPointArray) {
            System.out.println(": " + i);
        }
    }
}
