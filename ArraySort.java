import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		System.out.println("������һ����������");

		Scanner scan = new Scanner(System.in);

		String line = scan.nextLine();
		String sarr[] = line.split("\\s+");
		int iarr[] = new int[sarr.length];
		for (int i = 0; i < sarr.length; i++) {
			iarr[i] = Integer.parseInt(sarr[i]);
		}
		Arrays.sort(iarr);
		System.out.print("�����е���Сֵ�ǣ�" + iarr[0] + " ��ԭ������λ��λ��");
		for (int i = 0; i < iarr.length; i++) {
			if (iarr[0] == Integer.parseInt(sarr[i])) {
				System.out.print((i + 1) + "��");
			}
		}
		System.out.println();
		System.out.print("�����е����ֵ�ǣ�" + iarr[iarr.length - 1] + " ��ԭ������λ��λ��");
		for (int i = 0; i < iarr.length; i++) {
			if (iarr[iarr.length - 1] == Integer.parseInt(sarr[i])) {
				System.out.print((i + 1) + "��");
			}
		}
		System.out.println();
		System.out.print("���������Ϊ��");
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}
}
