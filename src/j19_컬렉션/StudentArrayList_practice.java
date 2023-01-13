package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList_practice {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("김종환", 1));
		students.add(new Student("고병수", 2));
		students.add(new Student("손민재", 3));
		students.add(new Student("황창욱", 4));
		
		System.out.println(students);
		
		System.out.println();
//		System.out.println(students.get(0).getName());
		
		String searchName = "김종환";
		
		boolean flag = true;
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("검색 실패!");
		}
		
		System.out.println(students);
		
		
	}

}
