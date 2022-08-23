package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        String newSentence;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter search term: ");
        searchTerm = input.next();
        Integer index = sentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        if (sentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println(searchTerm + " can be found at index " + index +
                    " and has a length of " + length + " characters.");
            newSentence = sentence.replace(searchTerm, "");
            System.out.println(newSentence);
        } else {
            System.out.println(searchTerm + " was not found in the text.");
        }

    }
}
