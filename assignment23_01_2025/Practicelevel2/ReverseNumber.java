package assignment23_01_2025.Practicelevel2;
import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        System.out.print("Reversed Number: ");
       for (int i = 0; i < count; i++) {
          System.out.print(digits[i]);
        }
    }
}