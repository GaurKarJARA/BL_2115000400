package BuildInfunctions;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MaxOfnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter three numbers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            System.out.println("Maximum number: " + findMaximum(num1, num2, num3));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close();
        }
    }
    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

