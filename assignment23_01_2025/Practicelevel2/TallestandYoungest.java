package assignment23_01_2025.Practicelevel2;

import java.util.Scanner;
public class TallestandYoungest {
    public static void main(String[] args) {
        final int FriendCount = 3;
        int[] ages = new int[FriendCount];
        double[] heights = new double[FriendCount];
        int youngest = Integer.MAX_VALUE, youngestIndex = -1;
        double tallest = 0.0;
        int tallestIndex = -1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < FriendCount; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            int age = sc.nextInt();
            while (age <= 0) {
                System.out.println("Invalid age");
                age = sc.nextInt();
            }
             ages[i] = age;

             System.out.print("Enter height of friend " + (i + 1) + " in meters: ");
             double height = sc.nextDouble();
        while (height <= 0) {
                System.out.println("Invalid height");
                height = sc.nextDouble();
            }
            heights[i] = height;

             if (age < youngest) {
                youngest = age;
                youngestIndex = i;
            }
             if (height > tallest) {
                tallest = height;
                 tallestIndex = i;
            }
         }

        System.out.println("\nYoungest Friend: " + (youngestIndex + 1) + " with age " + youngest);
        System.out.println("Tallest Friend: " + (tallestIndex + 1) + " with height " + tallest + " meters");
    }
}
