package j01_출력;

import j17_스태틱.싱글톤.KIA;

/**
 * 
 * @author ITPS
 *
 */


 
public class HelloJava {
	// 주석: 코드 내부에 메모를 할 때 사용함.
			// 컴파일 시에 무시됨.
			// 한 줄 주석
			// tap 들여쓰기
			/*
			 * 여러줄 주석
			 * 1
			 * 2
			 * 3
			 */
			/**
			 * 클래스, 메소드 등의 정보를 설명하기 위한 주석
			 */
	// 프로그램의 시작점
public static void main(String[] args) {
		System.out.println("Hello, Java!!"); //한줄의 문자열을 출력후 끝에 줄바꿈을 해라.
		System.out.println("이름: 조병철");
		System.out.println("주소: 부산 동구 조방로26번길");
		System.out.println("연락처: 010-7367-3632");
		System.out.println("수업: AWS기반 공공빅데이터 활용 웹개발자 양성");
		
		//j17싱글톤에서 만든 getInstance가 바로 호출된다.
		System.out.println();
		KIA.getInstance().printCompanyName();
	}

}

