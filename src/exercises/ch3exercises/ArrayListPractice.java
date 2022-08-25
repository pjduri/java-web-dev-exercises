package exercises.ch3exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (integers.size() < 10) {
            int num = (int) Math.floor(Math.random() * 10);
            Integer number = Integer.valueOf(num);
            integers.add(number);
        }
        System.out.println(integers);
        System.out.println(findSumEvens(integers));
    }

    public static int findSumEvens(ArrayList<Integer> nums) {
        Integer sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum  += num;
            }
        } return sum;
    }

}