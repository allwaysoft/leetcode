import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution946 {

	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> s = new Stack<Integer>();

		int j = 0;// poppedµÄindex
		for (int i = 0; i < pushed.length; ++i) {
			s.push(pushed[i]);
			while (!s.isEmpty() && s.peek() == popped[j]) {
				s.pop();
				j++;
			}
		}

		while (!s.isEmpty() && j < popped.length) {
			if (s.peek() == popped[j]) {
				s.pop();
				j++;
			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Solution946 sol = new Solution946();

		int[] pushed = { 1, 2, 3, 4, 5 };
		int[] popped = { 4, 5, 3, 2, 1 };
		System.out.println(sol.validateStackSequences(pushed, popped));
	}
}
