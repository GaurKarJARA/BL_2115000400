public class ConcatenateStrings {
	public static void main(String[] args) {
		String[] strings = {"Hello", " ", "World", "!"};
        System.out.println(helper(strings));
	}
	private static String helper(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}
