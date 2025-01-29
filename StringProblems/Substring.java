package StringProblems;

import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String text = sc.nextLine();
            System.out.println("Enter the substring to count:");
            String sub = sc.next();
            System.out.println("Occurrences: " + countSubstringOccurrences(text, sub));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int countSubstringOccurrences(String text, String sub) {
        if (text == null || sub == null) {
            throw new IllegalArgumentException("Neither text nor substring can be null.");
        }
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}