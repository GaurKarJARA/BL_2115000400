import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String string, char characterToRemove) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != characterToRemove) {
                result += ch;
            }
        }
        return result;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        char characterToRemove = scanner.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(string, characterToRemove));
    }
}