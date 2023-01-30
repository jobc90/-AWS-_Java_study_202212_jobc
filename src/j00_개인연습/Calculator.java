package j00_개인연습;

public class Calculator {
	
	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	public static int sub(int num1, int num2) {
		
		int result = num1 - num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int plus = add(10, 20);
		int minus = sub(200, 100);
		
		System.out.println(plus);
		System.out.println(minus);
		
	}
	
}

