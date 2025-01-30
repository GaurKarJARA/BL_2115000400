import java.util.Scanner;
public class MostFrequentCharacter {
    public static char mostFrequentCharacter(String string) {
        int[] freq = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < string.length(); i++) {
            freq[string.charAt(i)]++;
        }
        int maxFreq = 0;
        char mostFrequent = '\0';
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Most Frequent Character: " + mostFrequentCharacter(input));
    }
}