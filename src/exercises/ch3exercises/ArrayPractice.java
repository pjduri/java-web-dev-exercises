package exercises.ch3exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] integerArr = {1, 1, 2, 3, 5, 8};
        for (int integer : integerArr) {
            if (!(integer % 2 == 0)) {
                System.out.println(integer);
            }
        }

        String catHatQuote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. I will " +
                "not eat them with a mouse.";
        String[] catHatWordsArr = catHatQuote.split(" ");
        String[] catHatSentencesArr = catHatQuote.split("\\.");
        System.out.println(Arrays.toString(catHatWordsArr));
        System.out.println(Arrays.toString(catHatSentencesArr));
    }

}

