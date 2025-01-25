package assignment23_01_2025.Practicelevel1;

import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        int[] studentAge = new int[10];
            Scanner sc = new Scanner(System.in);

        for (int i = 0; i < studentAge.length; i++) {
       System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
          if (age < 0) {
                System.out.println("Provide valid age");
                return;
            }
            studentAge[i] = age;
        }

           for (int age : studentAge) {
            if (age >= 18) {
   System.out.println("The student with the age " + age + " can vote.");
            } else {
          System.out.println("The student with the age " + age + " cannot vote.");
            }
      }
    }
}


