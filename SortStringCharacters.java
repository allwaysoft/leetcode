import java.util.Arrays;
import java.util.Scanner;

class SortStringCharacters {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        //2
        System.out.println("Enter a string : ");
        String userInput = scanner.nextLine();

        //3
        char[] charArray = userInput.toCharArray();


        //4
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    swapChars(i, j, charArray);
                }
            }
        }

        //6
        System.out.println("Sorted string " + String.valueOf(charArray));
    }

    //5
    private static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

}