package assignment22_01_2025.Practice_level2;

import java.util.Scanner;
public class Multiples {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Multiples of " + num + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
              if (i % num == 0) {
                 System.out.print(i+" ");
           }
           }
       }
}

