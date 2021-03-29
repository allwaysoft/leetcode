import java.util.Arrays;

public class Solution942 {
	public boolean validMountainArray(int[] arr) {
		if (arr.length == 1) {
			return false;
		}
		if (arr.length == 2) {
			return false;
		}
		int[] temp = arr.clone();
		Arrays.sort(temp);
		int max = temp[temp.length - 1];
		int maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				maxindex = i;
			}
		}
		if (arr.length - 1 == maxindex || maxindex == 0) {
			return false;
		}
		// System.out.println(maxindex);
		boolean status = true;
		for (int i = 0; i < maxindex; i++) {
			if (arr[i] >= arr[i + 1]) {
				status = false;
			}
		}
		for (int i = maxindex; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				status = false;
			}
		}

		return status;
	}

	public static void main(String[] args) {

		Solution942 s = new Solution942();
		int[] arr = { 0, 3, 2, 1 };

		System.out.println(s.validMountainArray(arr));
	}
}
