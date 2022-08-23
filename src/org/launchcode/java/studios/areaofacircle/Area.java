package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner rCm = new Scanner(System.in);
        System.out.println("Please enter the circle's radius: ");

        try {
            Double r = rCm.nextDouble();
            while (r < 0) {
                System.err.println("Input not valid, radius cannot be negative.");
                System.out.println("Please enter the circle's radius: ");
                r = rCm.nextDouble();
            }
            Double circleArea = Circle.getArea(r);
            System.out.println("The circle's area is " + circleArea);
        } catch (Exception err) {
            System.err.println("Invalid, must enter a number.");
        }
        rCm.close();
    }

}
