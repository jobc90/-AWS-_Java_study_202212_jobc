package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("=========<<식당>>=========");
			System.out.println("1. 김천");
			System.out.println("2. 1층식당");
			System.out.println("3. 국밥");
			System.out.println("4. 맥날");
			System.out.println("=========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=========================");
			
			System.out.println("식당 선택: ");
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == '0') {
				loopFlag1 = false;
			}else if (select == '1') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				
				System.out.println("=========<<김천>>=========");
				System.out.println("1. 라면");
				System.out.println("2. 돌솥");
				System.out.println("3. 오므라이스");
				System.out.println("4. 김볶");
				System.out.println("=========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=========================");
				
				System.out.println("메뉴 번호 선택: ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("라면을 선택했습니다.");
				}else if (select == '2') {
					System.out.println("돌솥을 선택했습니다.");
				}else if (select == '3') {
					System.out.println("오므라이스를 선택했습니다.");
				}else if (select == '4') {
					System.out.println("김볶을 선택했습니다.");
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("사용할 수 없는 번호입니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
			}
				
			}else if (select == '2') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				
				System.out.println("=========<<1층 식당>>=========");
				System.out.println("1. 제육");
				System.out.println("2. 카레");
				System.out.println("3. 된장");
				System.out.println("4. 김찌");
				System.out.println("=========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=========================");
				
				System.out.println("메뉴 번호 선택: ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("제육을 선택했습니다.");
				}else if (select == '2') {
					System.out.println("카레을 선택했습니다.");
				}else if (select == '3') {
					System.out.println("된장을 선택했습니다.");
				}else if (select == '4') {
					System.out.println("김찌를 선택했습니다.");
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("사용할 수 없는 번호입니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
			}								
			
			
			}else if (select == '3') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				
				System.out.println("=========<<국밥>>=========");
				System.out.println("1. 돼지");
				System.out.println("2. 순대");
				System.out.println("3. 섞어");
				System.out.println("4. 수육");
				System.out.println("=========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=========================");
				
				System.out.println("메뉴 번호 선택: ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("돼지국밥을 선택했습니다.");
				}else if (select == '2') {
					System.out.println("순대국밥을 선택했습니다.");
				}else if (select == '3') {
					System.out.println("섞어국밥을 선택했습니다.");
				}else if (select == '4') {
					System.out.println("수육백반을 선택했습니다.");
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("사용할 수 없는 번호입니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
			}
			
			}else if (select == '4') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				
				System.out.println("=========<<맥날>>=========");
				System.out.println("1. 빅맥");
				System.out.println("2. 상하이");
				System.out.println("3. 불고기");
				System.out.println("4. 치킨");
				System.out.println("=========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("=========================");
				
				System.out.println("메뉴 번호 선택: ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("빅맥버거를 선택했습니다.");
				}else if (select == '2') {
					System.out.println("상하이버거를 선택했습니다.");
				}else if (select == '3') {
					System.out.println("불고기버거를 선택했습니다.");
				}else if (select == '4') {
					System.out.println("치킨버거를 선택했습니다.");
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("사용할 수 없는 번호입니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
			}
			
			}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			System.out.println();
			
		}
		
		System.out.println("프로그램 정상 종료!");

	}

}
