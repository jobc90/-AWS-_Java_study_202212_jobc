package j12_배열.di;

public class Main {
	//의존성을 가지는 클래스를 외부에서 주입한다.
	//Dependency injection
	public static void main(String[] args) {
		
		Test_C tc = new Test_C();
		Test_C tc2 = new Test_C();
		
		Test_B tb = new Test_B(tc);
		
		Test_A ta = new Test_A(tb);
		
//		ta.setTB(tb);
		
		ta.testA1();
		ta.testA2();
		
	}
	

}
