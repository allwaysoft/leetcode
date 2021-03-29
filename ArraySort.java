import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		System.out.println("请输入一个整数数组");

		Scanner scan = new Scanner(System.in);

		String line = scan.nextLine();
		String sarr[] = line.split("\\s+");
		int iarr[] = new int[sarr.length];
		for (int i = 0; i < sarr.length; i++) {
			iarr[i] = Integer.parseInt(sarr[i]);
		}
		Arrays.sort(iarr);
		System.out.print("数组中的最小值是：" + iarr[0] + " 在原数组中位置位第");
		for (int i = 0; i < iarr.length; i++) {
			if (iarr[0] == Integer.parseInt(sarr[i])) {
				System.out.print((i + 1) + "个");
			}
		}
		System.out.println();
		System.out.print("数组中的最大值是：" + iarr[iarr.length - 1] + " 在原数组中位置位第");
		for (int i = 0; i < iarr.length; i++) {
			if (iarr[iarr.length - 1] == Integer.parseInt(sarr[i])) {
				System.out.print((i + 1) + "个");
			}
		}
		System.out.println();
		System.out.print("数组排序后为：");
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}
}
