package Quiz04;

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int res : arr)
			sum += res;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum / (arr.length));
	}
}
