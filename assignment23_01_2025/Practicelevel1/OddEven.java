package assignment23_01_2025.Practicelevel1;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Exiting.");
            return;
        }
          int[] evens = new int[num / 2 + 1];
         int[] odds = new int[num / 2 + 1];
         int evenIndex = 0, oddIndex = 0;
            for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else 
                odds[oddIndex++] = i;
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }

     System.out.println();
     System.out.print("Odd numbers: ");
     for (int i = 0; i < oddIndex; i++) {
         System.out.print(odds[i] + " ");
          }
      }
}

