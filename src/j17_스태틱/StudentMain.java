package j17_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];

		students[0] = new Student("이현수");
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");
		
		teachers[0] = new Teacher("김준일1");
		teachers[1] = new Teacher("김준일2");
		teachers[2] = new Teacher("김준일3");
		teachers[3] = new Teacher("김준일4");
		teachers[4] = new Teacher("김준일5");
		
		
//		Student s = new Student("김준일");
//		System.out.println(s); // s뒤에 .toString이 생략되어있다.
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);//students[i].toString인데 .toString이 생략되어 있다.
			System.out.println(teachers[i]);
			System.out.println();			
			
		}
		
		System.out.println(Student.getAutoIncerement());
		int j = 0;
		for(Student s : students) {
			System.out.println(s);
			System.out.println(teachers[j]);
			j++;
		}

		
	}

}
//for(int i = 0; i < students.length; i++) {
//	System.out.println(students[i]);//students[i].toString인데 .toString이 생략되어 있다.
//	System.out.println(teachers[i]);
//	System.out.println();			
//	
//}
//
//System.out.println(Student.getAutoIncerement());
//int j = 0;
//for(Student s : students) {
//	System.out.println(s);
//	System.out.println(teachers[j]);
//	j++;
//}
//
//는 같은 표현이다