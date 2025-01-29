package StringProblems;
import java.util.Scanner;
public class RemoveDuplicates {
        public static String removeDuplicateChars(String str) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (result.indexOf(String.valueOf(ch)) == -1) {
                    result.append(ch);
                }
            }
            return result.toString();
        }
    
        public static void main(String[] args) {
            String string = "banana";
            System.out.println("Modified string: " + removeDuplicateChars(string));
        }
    }

