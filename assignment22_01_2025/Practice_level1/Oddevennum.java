package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class Oddevennum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = input.nextInt();

        if (num >= 1) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
    }
}


