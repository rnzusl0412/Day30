package Quiz07;

public class ExTest {

	public static void main(String[] args) {
		Calc calc = new Calc();
		try {
			double sum = calc.getSum(Integer.parseInt(args[0]));
			System.out.println("��� ��: " + sum);
		} catch (InvalidException e) {
			System.out.println("�Է� ���� ������ �ֽ��ϴ�. ");
		}
	}
}
