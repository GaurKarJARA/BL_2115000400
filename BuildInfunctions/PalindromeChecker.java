package BuildInfunctions;
import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String string) {
        string = string.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Is Palindrome? " + isPalindrome(input));
        sc.close();
    }
}

