package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = null;
		int number1 = 0;
		String str2 = null;
		String str3 = null;
		
		System.out.print("이름 : ");
		str1 = scanner.next();
		
		System.out.print("나이 : ");
		number1 = scanner.nextInt();
		
		System.out.print("주소 : ");
		str2 = scanner.nextLine();
		
		System.out.print("연락처 : ");
		str3 = scanner.next();
		
		
		System.out.println("사용자의 이름은 " + str1 + "이고 나이는 " + number1 + "살입니다.");
		System.out.println("주소는 " + str2 + "에 거주중입니다. ");
		System.out.println("연락처는 " + str3 + " 입니다.");
		
		
	}

}
