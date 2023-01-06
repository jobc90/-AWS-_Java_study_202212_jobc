package j09_클래스;

import java.util.Scanner;

public class J09_UserMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		J09_User u1 = new J09_User();
		J09_User u2 = new J09_User();
		J09_User u3 = new J09_User();
		J09_User u4 = new J09_User();
		J09_User m = new J09_User();
		
		
		u1.username = "aaa";
		u1.password = "1234";
		u1.name = "김종환";
		u1.nationalIdentityNumber = "900101 - 1111111";
		u1.adress = "부산 동구 범일동";
		u1.email = "aaa@gmail.com";
		
		u2.username = "bbb";
		u2.password = "1234b";
		u2.name = "박종환";
		u2.nationalIdentityNumber = "900102 - 1222222";
		u2.adress = "부산 사상구 주례동";
		u2.email = "bbb@gmail.com";
		
		u3.username = "ccc";
		u3.password = "1234c";
		u3.name = "나종환";
		u3.nationalIdentityNumber = "900103 - 1333333";
		u3.adress = "부산 남구 문현동";
		u3.email = "ccc@gmail.com";
		
		u4.username = "ddd";
		u4.password = "1234d";
		u4.name = "이종환";
		u4.nationalIdentityNumber = "900104 - 1444444";
		u4.adress = "부산 진구 전포동";
		u4.email = "ddd@gmail.com";
		
		m.master = "a1234";
		String m1 = null;
		
		String n = null;
		String n2 = null;
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("1. 관리자용");
			System.out.println("2. 사용자용");
			System.out.println("=========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=========================");
			
			System.out.println("접속모드를 선택하세요.");
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == '0') {
				loopFlag1 = false;
			}else if (select == '1') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				System.out.println("관리자 비밀번호를 입력하세요.");
				System.out.println("=========================");
				System.out.println("q. 프로그램 종료");
				System.out.println("=========================");
				m1 = scanner.next();	
				
				if(select == 'q' || select == '0') {
					loopFlag2 = false;
				}else if (m1.equals(m.master)) {
					System.out.println("===============관리자용===============");
					System.out.println("김종환님의 정보입니다.");
					u1.printUserInfo();
					System.out.println("박종환님의 정보입니다.");
					u2.printUserInfo();
					System.out.println("나종환님의 정보입니다.");
					u3.printUserInfo();
					System.out.println("이종환님의 정보입니다.");
					u4.printUserInfo();					
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
					
			
		}
		
		System.out.println("===============사용자용===============");
		
		
			}else if (select == '2') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
					
				System.out.print("이름 입력: ");
				n = scanner.next();
				System.out.print("아이디 입력: ");
				n2 = scanner.next();
				
				if (n.equals(u1.name) && n2.equals(u1.username)) {
					System.out.println("김종환님의 정보입니다.");
					u1.printUserInfo(u1.username, u1.name, u1.email);
				}else if (n.equals(u2.name) && n2.equals(u2.username)) {
					System.out.println("박종환님의 정보입니다.");
					u2.printUserInfo(u2.username, u2.name, u2.email);
				}else if (n.equals(u3.name) && n2.equals(u3.username)) {
					System.out.println("나종환님의 정보입니다.");
					u3.printUserInfo(u3.username, u3.name, u3.email);
				}else if (n.equals(u4.name) && n2.equals(u4.username)) {
					System.out.println("이종환님의 정보입니다.");
					u4.printUserInfo(u4.username, u4.name, u4.email);
				}else {
					System.out.println("정보를 찾을 수 없습니다.");
				}
			}
		}		
		
	}
	}
}

