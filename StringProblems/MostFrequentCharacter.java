package StringProblems;

import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            System.out.println("Most Frequent Character: " + mostFrequentCharacter(input));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static char mostFrequentCharacter(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty.");
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : string.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        return Collections.max(freqMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}

