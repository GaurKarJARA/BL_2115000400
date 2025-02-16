import java.util.*;
public class RemoveDuplicatesUsingStringbuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.print(helper(string));
		sc.close();
	}
	private static String helper(String string) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<Character>();
		for(char ch : string.toCharArray()) {
			if(!set.contains(ch)) {
				sb.append(ch);
				set.add(ch);
			}
		}
		return sb.toString();
	}
} 