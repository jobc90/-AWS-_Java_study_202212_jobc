package j17_스태틱.싱글톤;

public class A {
	private Student[] students;
	private static A instance = null;
	
	private A() {
		students = new Student[3];		
	}
	
	public static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				return; //반복만 멈추기 위해 return이 들어간다.
				        //break가 들어가면 for문 전체가 멈춰 밑에 코드가 실행된다.
						//return이 들어가면 메소드가 멈춘다.
			}
		}
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
		System.out.println();
	}
	
	public void showStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}

}


//
//package j17_스태틱.싱글톤;
//
//public class A {
//	private Student[] students;
//	
//	public A() {
//		students = new Student[3];		
//	}
//	
//	public void addStudent(Student student) {
//		
//		for(int i = 0; i < students.length; i++) {
//			if(students[i] == null) {
//				students[i] = student;
//				return; //반복만 멈추기 위해 return이 들어간다.
//				        //break가 들어가면 for문 전체가 멈춰 밑에 코드가 실행된다.
//						//return이 들어가면 메소드가 멈춘다.
//			}
//		}
//		System.out.println("더 이상 학생을 추가할 수 없습니다.");
//		System.out.println();
//	}
//	
//	public void showStudents() {
//		for(Student student : students) {
//			System.out.println(student);
//		}
//		System.out.println();
//	}
//
//}

