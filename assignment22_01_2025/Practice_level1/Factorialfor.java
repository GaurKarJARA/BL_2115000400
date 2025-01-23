package assignment22_01_2025.Practice_level1;

import java.util.Scanner;
public class Factorialfor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = input.nextInt();

        if (num >= 0) {
            int factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }

    }
}
