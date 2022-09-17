package org.launchcode.java.demos.lsn6inheritance;

public class CatMain {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println("Garfield is tired: " + garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println("Spike's Weight: " + spike.getWeight());

        // commented out to work with abstract examples
        // Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        // commented out to work with abstract examples
        // System.out.println("Plain cat says: " + plainCat.noise());
        System.out.println("Cheshire Cat says: " + cheshireCat.noise());
        cheshireCat.sleep();
        System.out.println("Cheshire Cat says before breakfast and coffee: " + cheshireCat.noise());
        cheshireCat.eat();
        System.out.println("Cheshire Cat says after breakfast and coffee: " + cheshireCat.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println("Suki says: " + suki.noise());
        System.out.println("Suki is satisfied: " + ((HouseCat) suki).isSatisfied());

    }

}
