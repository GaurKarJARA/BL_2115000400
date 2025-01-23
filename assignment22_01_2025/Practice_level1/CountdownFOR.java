package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class CountdownFOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting value for countdown:");
        int counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
        input.close();
    }
}

