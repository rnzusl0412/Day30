package Quiz02;

public class TvTest {
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, " 3D TV");

		int max = 0;
		int min = 0;
		for (int i = 0; i < tvArray.length; i++) {
			System.out.print(
					tvArray[i].getName() + "   " + tvArray[i].getPrice() + "  " + tvArray[i].getDescription() + "\n");
			if (tvArray[max].getPrice() < tvArray[i].getPrice())
				max = i;
			if (tvArray[min].getPrice() > tvArray[i].getPrice())
				min = i;
		}
		System.out.println("가격이 가장 비싼 제품 : " + tvArray[max].getName());
		System.out.println("가격이 가장 저렴한 제품 : " + tvArray[min].getName());
	}
}
