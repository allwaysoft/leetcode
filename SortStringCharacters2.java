import java.util.Arrays;
import java.util.Scanner;

class SortStringCharacters2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String userInput = scanner.nextLine();

		char[] charArray = userInput.toCharArray();

		Arrays.sort(charArray);
		System.out.println("Sorted string " + String.valueOf(charArray));
	}

}