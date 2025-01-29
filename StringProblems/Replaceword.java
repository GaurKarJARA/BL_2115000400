package StringProblems;

import java.util.Scanner;
public class Replaceword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a sentence:");
            String sentence = sc.nextLine();
            System.out.println("Enter the word to replace:");
            String oldWord = sc.nextLine();
            System.out.println("Enter the new word:");
            String newWord = sc.nextLine();
            System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static String replaceWord(String string, String oldWord, String newWord) {
        if (string == null || oldWord == null || newWord == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }
        return string.replace(oldWord, newWord);
    }
}

