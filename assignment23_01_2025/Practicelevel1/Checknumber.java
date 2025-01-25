package assignment23_01_2025.Practicelevel1;
import java.util.Scanner;
public class Checknumber {
       public static void main(String[] args) {
      int[] numbers = new int[5];
    Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        if (numbers[0] > numbers[numbers.length - 1]) {
               System.out.println("The first element is greater than the last element.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
         System.out.println("The first element is less than the last element.");
        } else {
         System.out.println("The first and last elements are equal.");
          }
      }
    }

