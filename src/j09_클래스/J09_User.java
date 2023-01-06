package j09_클래스;

public class J09_User {

	String username;
	String password;
	String name;
	String email;
	String nationalIdentityNumber;
	String adress;
	String master;
	
	// 기본생성자
//	J09_Student(){
//		System.out.println("생성됨!");
//	}
	
	void printUserInfo() {
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("주민번호: " + nationalIdentityNumber);
		System.out.println("주소: " + adress);
		System.out.println("이메일: " + email);
		System.out.println();
	}
	
	void printUserInfo(String username, String name, String email) {
		System.out.println("아이디: " + username);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
	}
	
}
