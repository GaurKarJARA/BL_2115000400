package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num >= 0) {
            int sum = num * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + num+ " is not a natural number.");
        }
    }
    }
