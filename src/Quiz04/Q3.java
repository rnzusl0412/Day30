package Quiz04;

public class Q3 {
	public static void main(String[] args) {
		int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int sum = 0;
		for (int[] h : arr2)
			for (int v : h)
				sum += v;
		System.out.println("total = " + sum);
		System.out.println("average = " + (double) sum / (arr2.length * arr2[0].length));
	}
}
