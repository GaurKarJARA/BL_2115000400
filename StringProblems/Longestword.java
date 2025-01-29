package StringProblems;

import java.util.Scanner;
public class Longestword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a sentence:");
            String input = sc.nextLine();
            System.out.println("Longest Word: " + findLongestWord(input));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Sentence cannot be empty.");
        }
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}

