import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = scanner.nextLine();
        System.out.println("Enter string 2:");
        String str2 = scanner.nextLine();
        System.out.println("Are they anagrams? " + Anagrams(str1, str2));
    }
    public static boolean Anagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
     return false;
        }
        if (str1.length() != str2.length()) {
      return false;
        }
  int[] charCount = new int[256];
  for (int i = 0; i < str1.length(); i++) {
    charCount[str1.charAt(i)]++;
    charCount[str2.charAt(i)]--;
        }
    for (int count : charCount) {
        if (count != 0) {
          return false;
            }
        }
        return true;
    }
}