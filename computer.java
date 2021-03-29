import java.util.Scanner;

public class computer {
//实现加减乘除的简单计算
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 功能列表
		System.out.println("请输入数字选择需要使用的功能");
		System.out.println("1.加法功能");
		System.out.println("2.减法功能");
		System.out.println("3.乘法功能");
		System.out.println("4.除法功能");
		System.out.println(" ");

		// 告知已选择功能

		Scanner scan = new Scanner(System.in);
		int listnumber = scan.nextInt();
		switch (listnumber) {
		case 1:
			System.out.print("已经选择加法功能");
			break;

		case 2:
			System.out.print("已经选择减法功能");
			break;

		case 3:
			System.out.print("已经选择乘法功能");
			break;

		case 4:
			System.out.print("已经选择除法功能");
			break;

		default:
			System.out.print("输入不合法");

		}

		System.out.println("请输入需要计算的数字");

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
			System.out.print("输入不合法");

		}

		System.out.println("结果为" + app);

	}

//加法
	public static float add1(float input1, float input2) {
		float result = input1 + input2;
		return result;
	}

//减法
	public static float add2(float input1, float input2) {
		float result = input1 - input2;
		return result;

	}

//乘法
	public static float add3(float input1, float input2) {
		float result = input1 * input2;
		return result;
	}

//除法
	public static float add4(float a, float b) {
		if (b == 0) {
			System.out.println("除数不能为零");
			return 0;
		}

		float result = a / b;
		return result;

	}
}