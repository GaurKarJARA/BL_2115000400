package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

class whilesum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num >= 0) {
            int sumFormula = num* (num + 1) / 2;
            int sumLoop = 0;
            int i = 1;
            while (i <= num) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
        } else {
            System.out.println("The number " + num + " is not a natural number.");
        }
    }
}
