package Quiz07;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };

		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}

		avg = sum / ((array.length) * (array[0].length));

		System.out.printf("�հ� : %.1f\n", sum);
		System.out.printf("��� : %.2f\n", avg);

	}
}
