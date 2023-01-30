package j22_익명클래스;

public class Main {
	
	public static void main(String[] args) {
		
		//새로운 클래스를 만들어 익명클래스를 implements하여 사용하는 방법
		Calculator c1 = new Addition();
		System.out.println(c1.calc(10, 20));
		
/////////////////////////////////////////////////////////////////////////////
		
		//임시로 클래스를 만들어 익명 클래스를 사용하는 방법
		Calculator c2 = new Calculator() {
			
			@Override
			public int calc(int x, int y) {
				// TODO Auto-generated method stub
				return x - y;
			}
		};
		System.out.println(c2.calc(200, 100));
		
/////////////////////////////////////////////////////////////////////////////
		
		//람다식을 이용하여 재정의하여 사용하는 방법
		Calculator c3 = (x,y) -> x * y;
		System.out.println(c3.calc(20, 3));
	}
}
