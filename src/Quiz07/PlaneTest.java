package Quiz07;

public class PlaneTest {

	public static void main(String[] args) {

		// Airplane�� Cargoplane ��ü ����
		Plane p1 = new Airplane("L747", 1000);
		Plane p2 = new Cargoplane("C40", 1000);

		// ������ ��ü�� ���� ���
		System.out.printf("  %-10s %-10s\n", "Plane", " fuelSize");
		System.out.println("-----------------------");
		System.out.printf("  %-10s   %-10d\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("  %-10s   %-10d\n", p2.getPlaneName(), p2.getFuelSize());

		// Airplane�� Cargoplane ��ü�� 100�� ����
		System.out.println("\n100 ����");
		p1.flight(100);
		p2.flight(100);

		// ���� �� ��ü�� ����� ���� ���
		System.out.printf("  %-10s %-10s\n", "Plane", " fuelSize");
		System.out.println("-----------------------");
		System.out.printf("  %-10s   %-10d\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("  %-10s   %-10d\n", p2.getPlaneName(), p2.getFuelSize());

		// Airplane�� Cargoplane ��ü�� 200�� ����
		System.out.println("\n200 ����");
		p1.refuel(200);
		p2.refuel(200);

		// ���� �� ��ü�� ����� ���� ���
		System.out.printf("  %-10s %-10s\n", "Plane", " fuelSize");
		System.out.println("-----------------------");
		System.out.printf("  %-10s   %-10d\n", p1.getPlaneName(), p1.getFuelSize());
		System.out.printf("  %-10s   %-10d\n", p2.getPlaneName(), p2.getFuelSize());

	}

}
