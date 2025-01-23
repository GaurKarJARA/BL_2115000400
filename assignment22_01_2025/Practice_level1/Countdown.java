package assignment22_01_2025.Practice_level1;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value for countdown:");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}