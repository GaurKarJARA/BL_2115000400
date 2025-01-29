package StringProblems;
import java.util.Scanner;
public class ToglecaseofLetters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            System.out.println("Toggled Case: " + toggleCase(input));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static String toggleCase(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        StringBuilder toggled = new StringBuilder();
        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(Character.toUpperCase(ch));
            }
        }
        return toggled.toString();
    }
}
