package assignment22_01_2025.Practice_level2;

import java.util.Scanner;
public class YoungestandTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
          System.out.print("Enter Amar's height (in cm): ");
         double amarHeight = sc.nextDouble();

      System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = sc.nextDouble();
          int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
            String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        double tallest = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallest == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallest == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println(youngestFriend + " is the youngest with age " + youngestAge);
        System.out.println(tallestFriend + " is the tallest with height " + tallest + " cm");
       }
}
