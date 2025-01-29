package BuildInfunctions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FactorialusingRecursion {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative.");
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            System.out.println("Factorial: " + factorial(number));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

