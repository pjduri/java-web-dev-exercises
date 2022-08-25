package exercises.ch2Exercises;

import java.util.Scanner;

public class MilesPerGallon {

        public static void main(String[] args) {
            double miles;
            double fuelUsed;
            double mpg;

            Scanner milesDriven = new Scanner(System.in);
            System.out.println("Please enter distance driven in mi: ");
            miles = milesDriven.nextDouble();
            milesDriven.close();

            Scanner gallonsUsed = new Scanner(System.in);
            System.out.println("Please enter fuel used in gallons: ");
            fuelUsed = gallonsUsed.nextDouble();
            gallonsUsed.close();

            mpg = miles / fuelUsed;
            System.out.println("You got " + mpg + "miles per gallon on your last trip.");

        }

}
