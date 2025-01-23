package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = input.nextInt();

        if (num >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}

