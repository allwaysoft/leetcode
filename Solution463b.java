import java.util.HashMap;
import java.util.Map.Entry;

public class Solution463b {
	public int islandPerimeter(int[][] grid) {
		int result = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (grid[row][column] == 0) {
					continue;
				}
				// вС
				if (column - 1 < 0 || grid[row][column - 1] == 0) {
					result++;
				}
				// ио
				if (row - 1 < 0 || grid[row - 1][column] == 0) {
					result++;
				}
				// ср
				if (column + 1 == grid[row].length || grid[row][column + 1] == 0) {
					result++;
				}
				// об
				if (row + 1 == grid.length || grid[row + 1][column] == 0) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Solution463b sol = new Solution463b();

		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		// int[][] grid = { { 0, 1 } };
		// int[][] grid = { { 1, 1 }, { 1, 1 } };

		System.out.println(sol.islandPerimeter(grid));
	}
}
