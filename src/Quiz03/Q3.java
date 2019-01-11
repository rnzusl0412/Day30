package Quiz03;

public class Q3 {
	public static void main(String[] args) {
		int i = 0;
		while(i<=6) {
			i++;
			int j = 0;
			while(j<=6) {
				j++;
				if (i + j == 6) {
					System.out.println(i +" + " + j + " = 6");
				}
			}
		}
	}
}
