import java.util.Scanner;

public class computer {
//ʵ�ּӼ��˳��ļ򵥼���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����б�
		System.out.println("����������ѡ����Ҫʹ�õĹ���");
		System.out.println("1.�ӷ�����");
		System.out.println("2.��������");
		System.out.println("3.�˷�����");
		System.out.println("4.��������");
		System.out.println(" ");

		// ��֪��ѡ����

		Scanner scan = new Scanner(System.in);
		int listnumber = scan.nextInt();
		switch (listnumber) {
		case 1:
			System.out.print("�Ѿ�ѡ��ӷ�����");
			break;

		case 2:
			System.out.print("�Ѿ�ѡ���������");
			break;

		case 3:
			System.out.print("�Ѿ�ѡ��˷�����");
			break;

		case 4:
			System.out.print("�Ѿ�ѡ���������");
			break;

		default:
			System.out.print("���벻�Ϸ�");

		}

		System.out.println("��������Ҫ���������");

		float input1 = scan.nextInt();
		float input2 = scan.nextInt();
		float app = 0;

		switch (listnumber) {
		case 1:
			app = add1(input1, input2);
			break;

		case 2:
			app = add2(input1, input2);
			break;

		case 3:
			app = add3(input1, input2);
			break;

		case 4:
			app = add4(input1, input2);
			break;

		default:
			System.out.print("���벻�Ϸ�");

		}

		System.out.println("���Ϊ" + app);

	}

//�ӷ�
	public static float add1(float input1, float input2) {
		float result = input1 + input2;
		return result;
	}

//����
	public static float add2(float input1, float input2) {
		float result = input1 - input2;
		return result;

	}

//�˷�
	public static float add3(float input1, float input2) {
		float result = input1 * input2;
		return result;
	}

//����
	public static float add4(float a, float b) {
		if (b == 0) {
			System.out.println("��������Ϊ��");
			return 0;
		}

		float result = a / b;
		return result;

	}
}