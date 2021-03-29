
public class Solution1451 {
	public String arrangeWords(String text) {
		String out = "";
		String[] arr = text.split("\\s+");

		int maxlen = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxlen) {
				maxlen = arr[i].length();
			}
		}
		int k = 0;
		for (int i = 0; i <= maxlen; i++) {
			for (int j = 0; j < arr.length; j++)
				if (arr[j].length() == i) {
					if (k == 0) {
						out = out + arr[j].substring(0, 1).toUpperCase() + arr[j].substring(1) + " ";
					} else {
						out = out + arr[j].toLowerCase() + " ";
					}
					k++;
				}

		}

		return out.trim();
	}

	public static void main(String[] args) {

		Solution1451 sol = new Solution1451();

		String text = "Leetcode is cool";

		System.out.println(sol.arrangeWords(text));
	}
}
