package assignment23_01_2025.Practicelevel2;
import java.util.Scanner;
public class ResizeLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                digits = tempArray;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
              largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                   secondLargest = digits[i];
            }
        }
         System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
}
}
