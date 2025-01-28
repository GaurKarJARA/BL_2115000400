package PracticeLevel_2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] ages = new int[10];
       for (int i = 0; i < 10; i++) {
          System.out.print("Enter age for student " + (i + 1) + ": ");
          ages[i] = sc.nextInt();
       }
    for (int i = 0; i < 10; i++) {
      boolean canVote = canStudentVote(ages[i]);
      if (canVote) {
         System.out.println("Student " + (i + 1) + " can vote.");
      } else {
            System.out.println("Student " + (i + 1) + " cannot vote.");
          }
       }
    }

   public static boolean canStudentVote(int age) {
      if (age < 0) {
      }
      return age >= 18;
   }

}
