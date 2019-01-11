package Quiz03;

import java.util.Scanner;

public class Q6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 1;
		int k = 0;
		int sum = 0;
		while (k <= 100-i) {
			k = i * j;
			sum += k;
			System.out.print("+" + k);
			j++;
		}
		System.out.print("=" + sum);
	}
}
