package BuildInfunctions;

import java.util.InputMismatchException;
import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            System.out.println(number + " is " + (isPrime(number) ? "a prime number." : "not a prime number."));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close();
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
