import java.util.Arrays;
import java.util.Comparator;

public class Solution1451b {
	public String arrangeWords(String text) {
		String[] words = text.toLowerCase().split("\\ ");
		Arrays.sort(words, Comparator.comparingInt(String::length));
		words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
		;
		return String.join(" ", words);
	}

	public static void main(String[] args) {

		Solution1451b sol = new Solution1451b();

		String text = "Leetcode is cool";

		System.out.println(sol.arrangeWords(text));
	}
}
