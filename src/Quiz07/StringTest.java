package Quiz07;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String args[]) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		// StringTokenizer�� �̿��Ͽ� �����͸� ������.
		StringTokenizer st = new StringTokenizer(str, ",");
		for (int i = 0; i < data.length; i++) {
			// �迭�� �Ǽ� �����͸� �ִ´�.
			data[i] = Double.parseDouble(st.nextToken());
		}

		for (int i = 0; i < data.length; i++) {
			// �迭 �������� ���� ���Ѵ�.
			sum += data[i];
		}

		// ��� ���� ����Ѵ�.
		System.out.printf("�հ� : %.3f\n", sum);
		System.out.printf("��� : %.3f", sum / 5.0);
	}

}
