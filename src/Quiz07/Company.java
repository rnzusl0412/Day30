package Quiz07;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Secretary("Hilery", 1, "secretary", 800));
		map.put(2, new Sales("Clinten", 2, "sales", 1200));

		System.out.printf("  %-10s %-15s %-10s\n", "name", "department", "salary");
		System.out.println("--------------------------------------");
		for (int i = 1; i <= map.size(); i++) {
			Employee e = map.get(i);
			System.out.printf("  %-10s %-15s %-10d\n", e.getName(), e.getDepartment(), e.getSalary());
		}
		System.out.println("\n 인센티브 100 지급\n");
		for (int i = 1; i <= map.size(); i++) {
			Employee e = map.get(i);
			if (e instanceof Secretary) {
				((Secretary) e).incentive(100);
			}
			if (e instanceof Sales) {
				((Sales) e).incentive(100);
			}
		}

		System.out.printf("  %-10s %-15s %-10s %-10s\n", "name", "department", "salary", "tax");
		System.out.println("--------------------------------------");
		for (int i = 1; i <= map.size(); i++) {
			Employee e = map.get(i);
			System.out.printf("  %-10s %-15s %-10d", e.getName(), e.getDepartment(), e.getSalary());
			if (e instanceof Secretary) {
				System.out.printf("%-10.1f\n", ((Secretary) e).tax());
			}
			if (e instanceof Sales) {
				System.out.printf("%-10.1f\n", ((Sales) e).tax());
			}
		}
	}
}
