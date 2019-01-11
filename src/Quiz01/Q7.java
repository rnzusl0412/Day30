package Quiz01;

public class Q7 {
	public static void main(String[] args) {
		int i = 5;
		System.out.printf("선언 변수 %5d일때 결과:\n숫자 %5d는 ", i, i);
		if (i % 2 == 0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		}
		System.out.println("입니다.");
	}
}
