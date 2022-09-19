package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    // sort by number of allergens
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        return Integer.compare(flavor1.getAllergens().size() - flavor2.getAllergens().size(), 0);
    }

    // sort by name
//    @Override
//    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName());
//    }

}
