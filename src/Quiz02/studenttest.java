package Quiz02;

import java.util.*;

public class studenttest {
	public static void main(String[] args) {
		student st1 = new student("�ε鷹", 15, 170, 55);
		student st2 = new student("���޷�", 22, 165, 53);
		student st3 = new student("������", 20, 155, 46);
		
		System.out.println("  �̸�   ����  ����  ������\n" + "=========================");
		studentview sv = new studentview();
		sv.viewStudent(st1);
		
		System.out.println();
		List<student> all = new ArrayList<>();
		all.add(st1);
		all.add(st2);
		all.add(st3);
		sv.viewStudentList(all);
	}
}
