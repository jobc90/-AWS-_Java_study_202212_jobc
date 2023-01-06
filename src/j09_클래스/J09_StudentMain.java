package j09_클래스;

public class J09_StudentMain {
	
	public static void main(String[] args) {
		
		
//		J09_Student student1 = new J09_Student();
//		J09_Student student2 = new J09_Student();
////		   자료형	 변수명		    값
//		
//		System.out.println(student1);
//		System.out.println(student2);
		
		
		
		J09_Student s1 = new J09_Student();
		J09_Student s2 = new J09_Student();
		
		s1.name = "조병철";
		s1.age = 34;
		
		s1.printInfo();
		s2.printInfo();
		
		
	}
}
