package Quiz04;

class Calc {
	static int calcSum(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		return sum;
	}
}

public class Q4 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);

		int sum = Calc.calcSum(a, b, c, d);

		double avg = sum / 4.0;

		System.out.println("Sum:" + sum);
		System.out.println("Avg:" + avg);

		switch ((int) avg / 10) {

		case 10:
		case 9:
			System.out.println("A����");
			break;
		case 8:
		case 7:
			System.out.println("B����");
			break;
		case 6:
		case 5:
			System.out.println("C����");
			break;
		case 4:
		case 3:
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");

		}
	}
}
