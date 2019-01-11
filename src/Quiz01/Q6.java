package Quiz01;

public class Q6 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 10+20;
		char ch = 'A';
		ch = 'A' + 2;
		float f = 1.5f;
		long l = 2700000000000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float) d == f2;

		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
	}
}
