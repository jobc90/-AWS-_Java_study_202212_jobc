package j07_반복;

import java.util.Scanner;

public class Loop3 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int count = 0;
			int total = 0;
			
			System.out.print("반복횟수: ");
			count = scanner.nextInt();
			System.out.println();

			for (int i = 1; i < count + 1; i++) {
				int a = 0;
				int b = 0;
				int c = 0;
				
				System.out.println(i + "번 반복");
				System.out.print("a: ");
				a = scanner.nextInt();
				System.out.print("b: ");
				b = scanner.nextInt();
				c = a + b;
				System.out.println(i + "번 합: " + c);
				total += c;
				System.out.println();
				
			}
			System.out.println("총합: " + total);
			
	}

}
