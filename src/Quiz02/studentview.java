package Quiz02;

import java.util.List;

public class studentview {
	public void viewStudent(student st) {
		System.out.printf("%5s %3d %5d %3d \n", 
				st.getName(), st.getAge(), st.getHeight(), st.getWeight());
	}
	
	public void viewStudentList(List<student> list) {
		for (student res : list) {
			System.out.printf("%5s %3d %5d %3d \n", 
					res.getName(), res.getAge(), res.getHeight(), res.getWeight());
		}
	}
}
