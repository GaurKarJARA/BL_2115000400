import java.util.Scanner;
public class Longestword {
    public static String LongestWord(String string1) {
        String[] words = string1.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        System.out.println("Longest Word: " + LongestWord(input));
    }
}

