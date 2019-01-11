package Quiz07;

public class ExTest {

	public static void main(String[] args) {
		Calc calc = new Calc();
		try {
			double sum = calc.getSum(Integer.parseInt(args[0]));
			System.out.println("결과 값: " + sum);
		} catch (InvalidException e) {
			System.out.println("입력 값에 오류가 있습니다. ");
		}
	}
}
