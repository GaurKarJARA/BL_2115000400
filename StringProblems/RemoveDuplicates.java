package StringProblems;

import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("String without duplicates: " + removeDuplicates(input));
    }
    public static String removeDuplicates(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
}