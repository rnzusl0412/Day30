package Quiz07;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return super.getSalary() * 0.10;
	}

	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary() + (int) (pay * 0.8));
	}
}
