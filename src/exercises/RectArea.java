package exercises;

import java.util.Scanner;

public class RectArea {

    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner lengthCm = new Scanner(System.in);
        System.out.println("Please enter length in cm: ");
        length = lengthCm.nextDouble();
        lengthCm.close();

        Scanner widthCm = new Scanner(System.in);
        System.out.println("Please enter width in cm: ");
        width = widthCm.nextDouble();
        area = length * width;
        widthCm.close();

        System.out.println("The rectangle's area is: " + area + "cm²");

    }

}
