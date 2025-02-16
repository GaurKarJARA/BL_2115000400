public class SearchingSpecificWord {
	public static void main(String[] args) {
		String[] sentences = {
				"KUCH BHI."
		};
		String word = "KUCH";
		System.out.println("Sentence containing word: " + helper(sentences, word));
	}
	public static String helper(String[] sentences, String word) {
		for (String sentence : sentences) {
			if (sentence.contains(word)) {
				return sentence;
			}
		}
		return "Not Found";
	}
}