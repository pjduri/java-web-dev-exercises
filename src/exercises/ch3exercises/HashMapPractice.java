package exercises.ch3exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String student;
        Integer idNum;

        System.out.println("Enter student id to search (or ENTER to finish): ");
        do {

            System.out.print("Student Name: ");
            student = input.nextLine();
            System.out.print("Id: ");
            idNum = input.nextInt();
            students.put(idNum, student);
            input.nextLine();

        } while(!student.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> id : students.entrySet()) {
            System.out.println("Id: " + id.getKey() + "Name: " + id.getValue());
        }


    }

}
