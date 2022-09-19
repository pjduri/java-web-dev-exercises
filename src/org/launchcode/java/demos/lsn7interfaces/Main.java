package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Comparator comparator = new FlavorComparator();

        // before sorting
        for (Flavor flavor : flavors) {
            System.out.println(flavor.toString());
        }
        System.out.println();
        for (Cone cone : cones) {
            System.out.println(cone.toString());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // after sorting
        for (Flavor flavor : flavors) {
            System.out.println(flavor.toString());
        }
        System.out.println();
        for (Cone cone : cones) {
            System.out.println(cone.toString());
        }

    }
}
