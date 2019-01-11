package Quiz07;

class Calc {
	public double getSum(int data) throws InvalidException {
		if (data >= 2 && data <= 5) {
			double sum = 0.0;
			for (int i = 1; i <= data; i++) {
				sum += i;
			}
			return sum;
		} else {
			throw new InvalidException();
		}
	}
}

@SuppressWarnings("serial")
public class InvalidException extends Exception {
	public InvalidException() {
		super();
	}
}
