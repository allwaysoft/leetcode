
public class Solution1385 {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0;
		boolean check = true;
		for (int i = 0; i < arr1.length; i++) {
			check = true;
			for (int j = 0; j < arr2.length; j++) {
				if (Math.abs(arr1[i] - arr2[j]) <= d) {
					check = false;
					break;
				}
			}
			if (check == true) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Solution1385 s = new Solution1385();

		int[] arr1 = { 4, 5, 8 };
		int[] arr2 = { 10, 9, 1, 8 };

		int d = 2;

		System.out.println(s.findTheDistanceValue(arr1, arr2, d));
	}
}
