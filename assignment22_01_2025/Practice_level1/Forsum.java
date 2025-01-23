package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class Forsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num >= 0) {
            int sumFormula = num * (num + 1) / 2;
            int sumLoop = 0;

            for (int i = 1; i <= num; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
        } else {
            System.out.println("The num " + num + " is not a natural number.");
        }
    }
}


