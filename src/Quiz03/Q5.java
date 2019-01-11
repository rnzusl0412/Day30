package Quiz03;

public class Q5 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 5) {
			i++;
			int j = 0;
			while (j <= 5) {
				int k = 0;
				j++;
				while (k <= 5) {
					k++;
					if ((i * j * k) % 3 == 0) {
						System.out.println(i + "*" + j + "*" + k + "=" + i * j * k);
					}
				}
			}
		}
	}
}
