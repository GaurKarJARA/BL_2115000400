import java.util.*;
public class ReverseStringUsingStringBulder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.print(helper(string));
		sc.close();
	}
	private static String helper(String string) {
		StringBuilder sb = new StringBuilder();
		for(int i = string.length() - 1 ; i >= 0 ; i--) {
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}
}