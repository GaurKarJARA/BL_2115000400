import java.util.InputMismatchException;
import java.util.Scanner;
public class TempConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter temperature value:");
            double temperature = sc.nextDouble();
            System.out.println("Convert to (C/F)?");
            char choice = sc.next().toUpperCase().charAt(0);
            if (choice == 'C') {
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
            } else if (choice == 'F') {
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
            } else {
                throw new IllegalArgumentException("Invalid choice! Enter 'C' or 'F'.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}