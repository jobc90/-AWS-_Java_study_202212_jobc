package j16_Object;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super(); // Object class를 상속하고있다.
				// Object class는 항상 최상위 클래스이다.
				// extends Object가 항상 생략되어있다.
		this.name = name;
		this.age = age;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		if(!(obj.getClass() == Student.class)) {
			return false;			
		}
		
		Student s = (Student) obj;
		boolean result = name.equals(s.name) && age == s.age;
		
		return result;
	}



	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	
	

}
