package Quiz04;

public class Q5 {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("Kim", 100, 90, 95, 89);
		student[1] = new Student("Lee", 60, 70, 99, 98);
		student[2] = new Student("Park", 68, 86, 60, 40);

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + " Æò±Õ: " + student[i].getAvg() + " ÇĞÁ¡:" + student[i].getGrade());
		}
	}
}
