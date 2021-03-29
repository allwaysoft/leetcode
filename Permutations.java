import java.util.List;
import java.util.ArrayList;

class Permutations {
	// list to store the permutaions
	static List<String> output = new ArrayList<>();

	public static void main(String[] args) {

		// Input a string

		String unique = "123";
		String duplicate = "112";

		/*
		 * call the permutation method with empty string as 1st and input string as the
		 * 2nd parameter
		 */
		System.out.println("All Permutations of Unique: ");
		permutation("", unique);
		System.out.println();
		System.out.println("All Permutations of Duplicate: ");
		permutation("", duplicate);
	}

	public static void permutation(String perm, String word) {
		// base condition: word is empty
		if (word.isEmpty()) {
			// print only if a new permutation is found
			if (!output.contains(perm)) {
				System.out.print(perm + " ");
				output.add(perm);
			}
		}

		// Loop
		for (int i = 0; i < word.length(); i++) {
			// split: remove the character at i from the word and append to the perm
			String w = word.substring(0, i) + word.substring(i + 1, word.length());
			String p = perm + word.charAt(i);

			// recursive call
			permutation(p, w);
		}

	}
}