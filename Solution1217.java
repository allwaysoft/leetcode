import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1217 {
	public int minCostToMoveChips(int[] position) {
		int oddsum = 0;
		int evensum = 0;
		for (int i = 0; i < position.length; i++) {
			if (position[i] % 2 == 1) {
				oddsum++;
			} else {
				evensum++;
			}
		}
		return oddsum > evensum ? evensum : oddsum;
	}

	public static void main(String[] args) {

		Solution1217 sol = new Solution1217();

		int[] position = { 2, 2, 2, 3, 3 };

		System.out.println(sol.minCostToMoveChips(position));
	}
}
