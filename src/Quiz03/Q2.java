package Quiz03;

public class Q2 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			i++;
			int j = 0;
			while (j <= i) {
				j++;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
