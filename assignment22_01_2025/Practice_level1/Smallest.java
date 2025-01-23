package assignment22_01_2025.Practice_level1;
import java.util.Scanner;
public class Smallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? true");
        } 
else    System.out.println("Is the first number the smallest? false");
        
    }
}
