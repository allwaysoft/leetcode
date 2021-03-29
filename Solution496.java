import java.util.Arrays;

public class Solution496 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] out = new int[nums1.length];
		int begin = -1;
		for (int i = 0; i < nums1.length; i++) {
			out[i] = -1;
			// System.out.println(i);
			begin = -1;
			for (int j = 0; j < nums2.length; j++) {
				// System.out.println(j);
				// System.out.println(begin);
				if (begin >= 0) {
					if (nums2[j] > nums1[i]) {
						out[i] = nums2[j];
						break;
					}
				}
				if (nums2[j] == nums1[i]) {
					begin = j;
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {

		Solution496 s = new Solution496();

		int[] nums1 = { 4, 1, 2 };

		int[] nums2 = { 1, 3, 4, 2 };
		System.out.println(Arrays.toString(s.nextGreaterElement(nums1, nums2)));
	}
}
