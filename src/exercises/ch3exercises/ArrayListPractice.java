package exercises.ch3exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();
        int userNum;

        while (integers.size() < 10) {
            int num = (int) Math.floor(Math.random() * 10);
            integers.add(num);
        }
        System.out.println(integers);
        System.out.println(findSumEvens(integers));

        String kidsBookQuote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. I will " +
                "not eat them with a mouse.";

        String[] quoteArr = kidsBookQuote
                .replaceAll("\\p{Punct}", "")
                .split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(quoteArr));

        System.out.println("Enter a number.");
        userNum = input.nextInt();
        System.out.println(getWordsofLength(words, userNum));
    }

    public static int findSumEvens(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum  += num;
            }
        } return sum;
    }

    public static ArrayList<String> getWordsofLength(ArrayList<String> oldWords, int num) {
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : oldWords) {
            if (word.length() == num) {
                wordList.add(word);
            }
        }
        return wordList;
    }

}