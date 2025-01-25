package assignment23_01_2025.Practicelevel1;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] multiplication = new int[10];

        for (int i = 1; i <= multiplication.length; i++) {
          multiplication[i - 1] = num * i;
        }

              for (int i = 0; i < multiplication.length; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + multiplication[i]);
      }
      }
   }


