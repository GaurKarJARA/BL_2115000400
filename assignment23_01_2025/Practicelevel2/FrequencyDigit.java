package assignment23_01_2025.Practicelevel2;
import java.util.*;
public class FrequencyDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int DigitCount = 0;
        int original = num;
        while (num > 0) {
            DigitCount++;
            num /= 10;
        }
        int[] digits = new int[10];
        for (int i = 0; i < DigitCount; i++) {
            int digit = original % 10;
            digits[digit]++;
            original /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of digit " + i + " is " + digits[i]);
     }
     }
  }


