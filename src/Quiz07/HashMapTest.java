package Quiz07;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		double sum = 0.0;
		for (int i = 0; i < 10; i++) {
			map.put(i, (int) (Math.random() * 99 + 1));
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-3d", map.get(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			sum += map.get(i);
		}
		System.out.printf("ÇÕ°è : %.2f\n", sum);
		System.out.printf("Æò±Õ : %.2f\n", sum / 10.0);
	}
}
