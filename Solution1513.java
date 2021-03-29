
public class Solution1513 {
	public int numIdenticalPairs(int[] nums) {
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					num = num + 1;
				}

			}
		}
		return num;

	}

	public static void main(String[] args) {
		int[] numsin = { 1, 2, 3, 1, 1, 3 };

		Solution1513 s = new Solution1513();

		System.out.println(s.numIdenticalPairs(numsin));
	}
}
